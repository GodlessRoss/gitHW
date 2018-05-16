package v1;

public abstract class Display {

	public static void printState(Coffemachine coffemachine) {
		coffemachine.getCurrentAmountOfGroundCoffee();
		System.out.printf("%nМолотый кофе: %8d гр. / %4d гр.", coffemachine.getCurrentAmountOfGroundCoffee(),
				coffemachine.getMaxAmountOfGroundCoffee());
		coffemachine.getCurrentAmountOfWater();
		System.out.printf("%nВода: %16d мл. / %4d мл.", coffemachine.getCurrentAmountOfWater(),
				coffemachine.getMaxAmountOfWater());
		coffemachine.getCurrentAmountOfUsedCoffee();
		System.out.printf("%nОтработанный кофе: %3d гр. / %4d гр.%n", coffemachine.getCurrentAmountOfUsedCoffee(), coffemachine.getMaxAmountOfUsedCoffee());
	}

}
