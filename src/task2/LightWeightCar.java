package task2;

public class LightWeightCar extends Car implements Moveable, Stopable {

	public LightWeightCar(Engine engine, String color, String name) {
		super(engine, color, name);
	}

	@Override
	public void move() {
		System.out.println("LightWeightCar is moving");
	}

	@Override
	public void stop() {
		System.out.println("LightWeightCar is stopping");

	}

}
