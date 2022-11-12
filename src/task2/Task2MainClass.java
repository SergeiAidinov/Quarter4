package task2;

import task2.Engine.fuel;

public class Task2MainClass {

	public static void main(String[] args) {

		LightWeightCar lightWeightCar = new LightWeightCar(new Engine(fuel.GAZOLINE), "White", "Kia Rio");
		Lorry lorry = new Lorry(new Engine(fuel.GAZ), "Red", "Izh - kabluk");
		lightWeightCar.open();
		lightWeightCar.start();
		lightWeightCar.move();
		lightWeightCar.stop();
		lightWeightCar.open();
		System.out.println();
		lorry.stop();
		lorry.open();
		lorry.payLoadCompartmentOpen();
		lorry.start();
		lorry.move();

	}

}
