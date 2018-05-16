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
		System.out.printf("%nОтработанный кофе: %3d гр. / %4d гр.%n", coffemachine.getCurrentAmountOfUsedCoffee(),
				coffemachine.getMaxAmountOfUsedCoffee());
	}

	public static void printMenu() {
		System.out.print("Выберите кнопку:" + "\n1■ Включить" + "\n2■ Выключить" + "\n3■ Приготовить эспрессо"
				+ "\n4■ Приготовить американо" + "\n5■ Очистка бака отработанного кофе" + "\n > ");
	}

	public static void printInstructionsForLackOfCoffee() {
		System.out.print("Засыпте в кофемашину молотый кофе" + "\n > ");
	}

	public static void printInstructionsForLackOfWhater() {
		System.out.print("Налейте в кофемашину воды" + "\n > ");
	}

}
