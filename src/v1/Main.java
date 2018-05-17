package v1;

import java.util.Scanner;

public class Main {

	static byte clickСount = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Display.printGreating();
		Coffemachine coffemachine = new Coffemachine(3000, 5000, 500,3000,1500);
		preparationForWork(coffemachine);
		startProgramm(coffemachine);
	}

	private static void preparationForWork(Coffemachine coffemachine) {
		Display.printInstructionsForLackOfCoffee();
		coffemachine.setCurrentAmountOfGroundCoffee(scan.nextInt());
		Display.printInstructionsForLackOfWhater();
		coffemachine.setCurrentAmountOfWater(scan.nextInt());
		Display.printInstructionsForLackOfMilk();
		coffemachine.setCurrentAmountOfMilk(scan.nextInt());
		Display.printInstructionsForLackOfBeansCoffee();
		coffemachine.setCurrentAmountOfBeansCoffee(scan.nextInt());

	}

	private static void startProgramm(Coffemachine coffemachine) {
		Display.printState(coffemachine);
		byte choose = makeChoose();
		selectionProcessing(coffemachine, choose);
		startProgramm(coffemachine);
	}

	private static byte makeChoose() {
		Display.printMenu();
		return scan.nextByte();
	}
	
	private static void selectionProcessing(Coffemachine coffemachine, byte choose) {
		switch (choose) {
		case 1:
			if (!coffemachine.isOn()) {
				Display.printCoffemachineIsOn();
				coffemachine.setOn(true);
			}
			break;
		case 2:
			clickСount++;
			if (clickСount == 2) {
				Display.printParting();
				System.exit(42);
			}
			Display.printCoffemachineIsOff();
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
			coffemachine.setCurrentAmountOfUsedCoffeeNil();
			break;
		case 6:
			clickСount=0;
			coffemachine.makeCoffe("латте");
			break;
		case 7:
			clickСount=0;
			coffemachine.makeCoffe("капучино");
			break;
		default:
			break;
		}
	}

}
