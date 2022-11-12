package ru.yandex.incoming34;

import java.util.UUID;

public interface MyList {

	Element get(UUID uuid);

	boolean add(Element element);

	boolean insert(Element element, Element previousElement, Element nextElement);

	Element delete(Element element);

}
