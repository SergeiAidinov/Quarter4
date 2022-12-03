package ru.yandex.incoming34.PingPong;

public class MainClass {

	enum message {
		Ping, Pong
	};

	public static void main(String[] args) throws InterruptedException {
		message[] possibleMessages = message.values();

		for (message mes : possibleMessages) {
			new PingPongThread(mes.name()).start();
		}

	}

}
