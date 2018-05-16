package v1;

public abstract class Display {

	public static void printGreating() {
		System.out.println("Для выхода из программы дважды нажмите  ■ Выключить ");
	}

	public static void printСoffeeMaking(String nameCoffe) {
		System.out.println("Начинаю готовить " + nameCoffe);
		System.out.println("Ваш " + nameCoffe + " готов.");
	}
	
	public static void printError(String error) {
		System.out.println("Ошибка!");
		switch (error) {
		case "not enough ground сoffee":
			System.out.println("Отсутствует молотый кофе!");
			break;
		case "not enough water":
			System.out.println("Отсутствует вода!");
			break;
		case "too much used сoffee":
			System.out.println("Переполнен бак с отработанным кофе");
			break;

		default:
			break;
		}
	}

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

	public static void printCoffemachineIsOn() {
		System.out.println("Кофемашина включается!" + "\n LOS"); // logo
	}

	public static void printCoffemachineIsOff() {
		System.out.println("Кофемашина выключается!" + "\n LOS"); // logo
	}

	public static void printParting() {
		System.out.println("Досвидания" + "\n LOS"); // logo
	}

}
