package ru.yandex.incoming34.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ValueKeeper {

	private int currentValue = 0;

	Lock lock = new ReentrantLock(true);

	public void changeValue(int increment) {
		if (lock.tryLock()) {
			System.out.println("Текущее значение: " + currentValue + " Изменение: " + increment);
			currentValue += increment;
			lock.unlock();
		} else {
			return;
		}
	}
}
