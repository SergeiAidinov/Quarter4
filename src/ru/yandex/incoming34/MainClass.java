package ru.yandex.incoming34;

import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

public class MainClass {

	public static void main(String[] args) {

		MyLinkedList myLinkedList = new MyLinkedList();

		Element redundantElement = new Element(UUID.randomUUID());
		redundantElement.setPayload("Зимний вечер");

		Element tileRoofElement = new Element(UUID.randomUUID());
		tileRoofElement.setPayload("То по черепичной кровле");

		String[] stringArray = new String[] { "Буря мглою небо кроет", "Вихри снежные крутя",
				"То, как зверь, она завоет", "То заплачет, как дитя", "То по кровле обветшалой",
				"Вдруг соломой зашумит", "То, как путник запоздалый", "К нам в окошко застучит." };

		Element[] elementArray = new Element[8];

		for (int i = 0; i < stringArray.length; i++) {
			Element element = new Element(UUID.randomUUID());
			element.setPayload(stringArray[i]);
			elementArray[i] = element;
			myLinkedList.add(element);
		}

		Iterator<Element> iterator = myLinkedList.iterator();

		while (iterator.hasNext()) {
			Element element = iterator.next();
			String payLoadString = element.getPayload();
			System.out.println(payLoadString);

		}
		System.out.println("<=============>");

		Element nullElement = myLinkedList.delete(redundantElement);
		if (Objects.nonNull(nullElement)) {
			System.out.println("     Удален элемент: " + nullElement.getPayload());
		} else {
			System.out.println("Не удалось удалить элемент " + redundantElement.getPayload());
		}
		System.out.println("     Удален элемент: " + myLinkedList.delete(elementArray[2]).getPayload());
		System.out.println("     Удален элемент: " + myLinkedList.delete(elementArray[0]).getPayload());
		System.out.println("     Удален элемент: " + myLinkedList.delete(elementArray[7]).getPayload());
		System.out.println("<=============>");
		System.out.println("Первый элемент: " + myLinkedList.get(myLinkedList.getFirstElementUuid()).getPayload());
		System.out.println("Последний элемент: " + myLinkedList.get(myLinkedList.getLastElementUuid()).getPayload());
		System.out.println("<=============>");

		// Заменяем кровлю на черепичную
		System.out.println("     Удален элемент: " + myLinkedList.delete(elementArray[4]).getPayload());
		myLinkedList.insert(tileRoofElement, elementArray[3], elementArray[5]);

		// Добавляем путника, но теперь он уже стучит в калитку
		Element ramblerElement = new Element(UUID.randomUUID());
		ramblerElement.setPayload("К нам в калитку постучит.");
		myLinkedList.add(ramblerElement);

		iterator = myLinkedList.iterator();

		System.out.println("Вот что осталось: ");

		while (iterator.hasNext()) {
			Element element = iterator.next();
			String payLoadString = element.getPayload();
			System.out.println(payLoadString);

		}

	}

}
