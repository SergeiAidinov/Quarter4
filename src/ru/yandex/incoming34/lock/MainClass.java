package ru.yandex.incoming34.lock;

public class MainClass {

	public static ValueKeeper valueKeeper;

	public static void main(String[] args) {
		valueKeeper = new ValueKeeper();
		for (int i = 0; i < 5; i++) {
			new Thread(new Counter(i + 1)).start();
		}
	}

}
