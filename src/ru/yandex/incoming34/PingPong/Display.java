package ru.yandex.incoming34.PingPong;

import java.util.concurrent.atomic.AtomicReference;

public class Display {

	private static AtomicReference<String> state = new AtomicReference<String>("Undefined");

	void displayMessage(String message) {

		if (state.get().equals(message)) {
			return;
		} else {
			System.out.println(message);
			state.set(message);
		}
	}
}
