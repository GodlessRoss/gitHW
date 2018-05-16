package v1;

import java.util.Scanner;

public abstract class Display {

	public static void printGreating() {
		System.out.println("Для выхода из программы дважды нажмите  ■ Выключить ");
	}

	public static void printСoffeeMaking(String nameCoffe) {
		System.out.println("Начинаю готовить " + nameCoffe);
		System.out.println("Ваш " + nameCoffe + " готов.");
	}

	public static void printFatalError() {
		System.out.println("Произошла аварийная ситуация!" + "\nБак переполнен"
				+ "\nУбедитесь, что количество кофе или воды не превышает максимально допустимое значение!"
				+ "\nПосле этого включите кофемашину и введите значения еще раз.");
		Display.printParting();
	}

	public static void printError(String error, Coffemachine coffemachine) {
		Scanner scan = new Scanner(System.in);
		char choose;
		System.out.println("Ошибка!");
		switch (error) {
		case "not enough ground сoffee":
			System.out.println("Отсутствует молотый кофе!");
			System.out.print("Вы засыпали кофе?\n Y/N" + "\n > ");
			choose = scan.next().charAt(0);
			scan.close();
			if ('Y' == choose) {
				System.out.print("Сколько вы засыпали?" + "\n > ");
				coffemachine.setCurrentAmountOfGroundCoffee(scan.nextInt());
			}
			break;
		case "not enough water":
			System.out.println("Отсутствует вода!");
			System.out.println("Вы долили воды?\n Y/N \n >  ");
			choose = scan.next().charAt(0);
			scan.close();
			if ('Y' == choose) {
				System.out.print("Сколько вы долили?" + "\n > ");
				coffemachine.setCurrentAmountOfWater(scan.nextInt());
			}
			break;
		case "too much used сoffee":
			System.out.println("Переполнен бак с отработанным кофе");
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
		System.out.print("Засыпте в кофемашину молотый кофе и укажите количество" + "\n > ");
	}

	public static void printInstructionsForLackOfWhater() {
		System.out.print("Налейте в кофемашину воды и укажите количество" + "\n > ");
	}

	public static void printCoffemachineIsOn() {
		System.out.println("Кофемашина включается!" + "\n LOS"); // logo
	}

	public static void printCoffemachineIsOff() {
		System.out.println("Кофемашина выключается!" + "\n LOS"); // logo
	}

	public static void printParting() {
		System.out.println("\nДосвидания" + "\n LOS"); // logo
	}

}
