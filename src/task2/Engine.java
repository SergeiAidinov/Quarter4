package task2;

public class Engine {

	enum fuel {
		DISEL, GAZOLINE, GAZ
	};

	private final fuel fuelType;

	public Engine(fuel fuelType) {
		this.fuelType = fuelType;
	}

	public fuel getFuelType() {
		return fuelType;
	}

}
