package task2;

public class Lorry extends Car implements Moveable, Stopable, Openable {

	public Lorry(Engine engine, String color, String name) {
		super(engine, color, name);
	}

	@Override
	public void move() {
		System.out.println("Lorry is moving");
	}

	@Override
	public void stop() {
		System.out.println("Lorry is stopping");
	}

	@Override
	public void payLoadCompartmentOpen() {
		System.out.println("Payload compartement is opend");

	}

}
