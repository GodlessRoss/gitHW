package coffemachine;

import java.util.Scanner;

public abstract class Display {

	static Scanner scan = new Scanner(System.in);
	
	public static void printGreating() {
		System.out.println("Для выхода из программы дважды нажмите  ■ Выключить ");
	}

	public static void printСoffeeMaking(String nameCoffe, boolean isHasFoat, int amountOfMilk) {
		System.out.println("\nНачинаю готовить " + nameCoffe);
		System.out.println("Добавляю " + MakingCoffee.NEED_AMOUNT_OF_GROUND_COFFE + " гр. кофе.");
		if ("американо".equals(nameCoffe)) {
			System.out.println("Добавляю " + MakingAmericano.NEED_AMOUNT_OF_WATER + " мл. воды.");
		} else {
			System.out.println("Добавляю " + MakingEspresso.NEED_AMOUNT_OF_WATER + " мл. воды.");
		}
		if (amountOfMilk > 0) {
			System.out.println("Добовляю " + amountOfMilk + " мл. молока.");
		}
		if (isHasFoat) {
			System.out.println("Взбеваю пенку");
		}
		System.out.println("Ваш " + nameCoffe + " готов!");
	}

	public static void printFatalError() {
		System.out.println("\nПроизошла аварийная ситуация!" + "\nБак переполнен!"
				+ "\nУбедитесь, что количество кофе, молока или воды не превышает максимально допустимое значение!");
	}

	public static void printToFinishWork() {
		System.out.print("Завершить работу?\n Y/N\n > ");
	}
	
	public static void printError(String error, Coffemachine coffemachine) {
		char choose;
		System.out.println("Ошибка!");
		switch (error) {
		case "not enough ground сoffee":
			System.out.println("Отсутствует молотый кофе!");
			System.out.print("Вы засыпали кофе?\n Y/N" + "\n > ");
			choose = scan.next().charAt(0);
			if ('Y' == choose) {
				System.out.print("Сколько вы засыпали?" + "\n > ");
				coffemachine.setCurrentAmountOfGroundCoffee(scan.nextInt());
			}
			break;
		case "not enough water":
			System.out.println("Отсутствует вода!");
			System.out.print("Вы долили воды?\n Y/N \n >  ");
			choose = scan.next().charAt(0);
			if ('Y' == choose) {
				System.out.print("Сколько вы долили?" + "\n > ");
				coffemachine.setCurrentAmountOfWater(scan.nextInt());
			}
			break;
		case "not enough milk":
			System.out.println("Отсутствует молоко!");
			System.out.print("Вы долили молока?\n Y/N \n >  ");
			choose = scan.next().charAt(0);
			if ('Y' == choose) {
				System.out.print("Сколько вы долили?" + "\n > ");
				coffemachine.setCurrentAmountOfMilk(scan.nextInt());
			}
			break;
		case "not enough beans coffee":
			System.out.println("Отсутствуют зерны кофе!");
			System.out.print("Вы долили зерна кофе?\n Y/N \n >  ");
			choose = scan.next().charAt(0);
			if ('Y' == choose) {
				System.out.print("Сколько вы долили?" + "\n > ");
				coffemachine.setCurrentAmountOfBeansCoffee(scan.nextInt());
			}
			break;
		case "too much used сoffee":
			System.out.println("Переполнен бак с отработанным кофе");
			break;
		}
	}

	public static void printState(Coffemachine coffemachine) {
		System.out.printf("%nВода: %16d мл. / %4d мл.", coffemachine.getCurrentAmountOfWater(),
				coffemachine.getMaxAmountOfWater());
		System.out.printf("%nМолоко: %14d мл. / %4d мл.", coffemachine.getCurrentAmountOfMilk(),
				coffemachine.getMaxAmountOfMilk());
		System.out.printf("%nМолотый кофе: %8d гр. / %4d гр.", coffemachine.getCurrentAmountOfGroundCoffee(),
				coffemachine.getMaxAmountOfGroundCoffee());
		System.out.printf("%nЗерна кофе: %10d гр. / %4d гр.", coffemachine.getCurrentAmountOfBeansCoffee(),
				coffemachine.getMaxAmountOfBeansCoffee());
		System.out.printf("%nОтработанный кофе: %3d гр. / %4d гр.%n", coffemachine.getCurrentAmountOfUsedCoffee(),
				coffemachine.getMaxAmountOfUsedCoffee());
	}

	public static void printMenu() {
		System.out.print("\nВыберите кнопку:" 
				+ "\n1■ Включить"
				+ "\n2■ Выключить" 
//				+ "\n3■ Приготовить эспрессо"
				+ "\n3■ Приготовить американо"
//				+ "\n6■ Приготовить капучино"
				+ "\n4■ Приготовить латте" 
				+ "\n5■ Очистка бака отработанного кофе" + "\n > ");
	}

	public static void printInstructionsForLackOfCoffee() {
		System.out.print("Засыпте в кофемашину молотый кофе и укажите количество" + "\n > ");
	}

	public static void printInstructionsForLackOfWhater() {
		System.out.print("Налейте в кофемашину воды и укажите количество" + "\n > ");
	}

	public static void printInstructionsForLackOfMilk() {
		System.out.print("Налейте в кофемашину молоко и укажите количество" + "\n > ");
	}

	public static void printInstructionsForLackOfBeansCoffee() {

		System.out.print("Засыпте в кофемашину зерна кофе и укажите количество" + "\n > ");

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
