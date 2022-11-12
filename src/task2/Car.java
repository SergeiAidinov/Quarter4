package task2;

abstract class Car {

	private Engine engine;
	private String color;
	private String name;

	public Car(Engine engine, String color, String name) {
		super();
		this.engine = engine;
		this.color = color;
		this.name = name;
	}

	protected void start() {
		System.out.println("Engine is starting");
	}

	public void open() {
		System.out.println("Cabine is opened");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
