package ru.yandex.incoming34.lock;

public class Counter extends Thread {

	private final int difference;

	public Counter(int value) {
		this.difference = value;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			MainClass.valueKeeper.changeValue(difference);
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
