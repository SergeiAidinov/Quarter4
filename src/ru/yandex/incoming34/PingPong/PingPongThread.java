package ru.yandex.incoming34.PingPong;

public class PingPongThread extends Thread {

	private final String message;

	public PingPongThread(String message) {
		this.message = message;
	}

	Display display = new Display();

	@Override
	public void run() {

		while (true) {
			display.displayMessage(message);

		}
	}
}
