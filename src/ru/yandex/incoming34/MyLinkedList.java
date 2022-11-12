package ru.yandex.incoming34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class MyLinkedList<E> implements MyList {

	private final static Map<UUID, Element> uuidElementMap = new HashMap<>();
	private UUID lastElementUuid;
	private UUID firstElementUuid;

	public Iterator<Element> iterator() {

		List<Element> elements = compileElementList(new ArrayList<>(), firstElementUuid);
		return elements.iterator();

	}

	private List<Element> compileElementList(List<Element> elementList, UUID elementUuid) {

		if (Objects.nonNull(uuidElementMap.get(elementUuid))) {
			Element element = uuidElementMap.get(elementUuid);
			elementList.add(element);
			compileElementList(elementList, element.getNextElementUuid());
		}

		return elementList;

	}

	public UUID getLastElementUuid() {
		return lastElementUuid;
	}

	public UUID getFirstElementUuid() {
		return firstElementUuid;
	}

	@Override
	public Element get(UUID uuid) {
		return uuidElementMap.get(uuid);
	}

	@Override
	public boolean add(Element element) {

		if (Objects.isNull(firstElementUuid) && Objects.isNull(lastElementUuid)) {
			firstElementUuid = element.getUuid();
			lastElementUuid = element.getUuid();
			uuidElementMap.put(element.getUuid(), element);
			return true;
		}

		if (Objects.nonNull(lastElementUuid)) {
			uuidElementMap.get(lastElementUuid).setNextElementUuid(element.getUuid());
			element.setPreviousElementUuid(getLastElementUuid());
			uuidElementMap.put(element.getUuid(), element);
			lastElementUuid = element.getUuid();
			return true;
		}

		return false;
	}

	@Override
	public boolean insert(Element elementToBeInserted, Element previousElement, Element nextElement) {
		if (Objects.isNull(uuidElementMap.get(previousElement.getUuid()))
				|| Objects.isNull(uuidElementMap.get(nextElement.getUuid()))) {
			return false;
		}

		uuidElementMap.get(previousElement.getUuid()).setNextElementUuid(elementToBeInserted.getUuid());
		uuidElementMap.get(nextElement.getUuid()).setPreviousElementUuid(elementToBeInserted.getUuid());
		elementToBeInserted.setPreviousElementUuid(previousElement.getUuid());
		elementToBeInserted.setNextElementUuid(nextElement.getUuid());
		uuidElementMap.put(elementToBeInserted.getUuid(), elementToBeInserted);
		return true;

	}

	@Override
	public Element delete(Element element) {
		Element elementToBeDeleted = uuidElementMap.get(element.getUuid());
		if (Objects.isNull(elementToBeDeleted)) {
			return null;
		}

		// Удаляем единственный элемент
		if (uuidElementMap.size() == 1) {
			uuidElementMap.clear();
			firstElementUuid = null;
			lastElementUuid = null;
			return element;
		}

		Element previousElement = uuidElementMap.get(elementToBeDeleted.getPreviousElementUuid());
		Element nextElement = uuidElementMap.get(elementToBeDeleted.getNextElementUuid());

		// Удаляем элемент из середины
		if (Objects.nonNull(previousElement) && Objects.nonNull(nextElement)) {
			previousElement.setNextElementUuid(nextElement.getUuid());
			nextElement.setPreviousElementUuid(previousElement.getUuid());
			return uuidElementMap.remove(element.getUuid());
		}

		// Удаляем элемент в начале
		if (Objects.isNull(previousElement) && Objects.nonNull(nextElement)) {
			nextElement.setPreviousElementUuid(null);
			firstElementUuid = nextElement.getUuid();
			return uuidElementMap.remove(element.getUuid());

		}

		// Удаляем элемент с конца
		if (Objects.nonNull(previousElement) && Objects.isNull(nextElement)) {
			previousElement.setNextElementUuid(null);
			lastElementUuid = previousElement.getUuid();
			return uuidElementMap.remove(element.getUuid());

		}

		return null;

	}

}
