package v1;

import java.util.Scanner;

public class Main {

	static byte clickСount = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Для выхода из программы дважды нажмите  ■ Выключить ");
		Coffemachine coffemachine = new Coffemachine(3000, 5000, 500);
		preparationForWork(coffemachine);
		startProgramm(coffemachine);
	}

	private static void preparationForWork(Coffemachine coffemachine) {
		System.out.print("Для начала работы, засыпте в кофемашину молотый кофе" + "\n > ");
		coffemachine.setCurrentAmountOfGroundCoffee(scan.nextInt());
		System.out.print("Налейте в кофемашину воды" + "\n > ");
		coffemachine.setCurrentAmountOfWater(scan.nextInt());

	}

	private static void startProgramm(Coffemachine coffemachine) {
		Display.printState(coffemachine);
		byte choose = makeChoose();
		selectionProcessing(coffemachine, choose);
		startProgramm(coffemachine);
	}

	private static byte makeChoose() {
		System.out.print("Выберите кнопку:" + "\n1■ Включить" + "\n2■ Выключить" + "\n3■ Приготовить эспрессо"
				+ "\n4■ Приготовить американо" + "\n5■ Очистка бака отработанного кофе" + "\n > ");
		return scan.nextByte();
	}

	private static void selectionProcessing(Coffemachine coffemachine, byte choose) {
		switch (choose) {
		case 1:
			if (!coffemachine.isOn()) {
				System.out.println("Кофемашина включается!" + "\n LOS"); // logo
				coffemachine.setOn(true);
			}
			break;
		case 2:
			clickСount++;
			if (clickСount == 2) {
				System.out.println("Досвидания" + "\n LOS"); // logo
				System.exit(42);
			}
			System.out.println("Кофемашина выключается!" + "\n LOS"); // logo
			coffemachine.setOn(true);
			break;
		case 3:
			clickСount = 0;
			coffemachine.makeCoffe("эспрессо");
			break;
		case 4:
			clickСount = 0;
			coffemachine.makeCoffe("американо");
			break;
		case 5:
			clickСount = 0;
			coffemachine.setCurrentAmountOfUsedCoffeeZiro(0);
			break;
		default:
			break;
		}
	}

}
