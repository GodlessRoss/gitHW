package coffemachine;

import java.util.Scanner;

public class Menu {

	private static int clickСount = 0;
	
	public static void start(Coffemachine coffemachine) {
		Helper.printMenu();
		byte choose = makeChoose();
		selectionProcessing(coffemachine, choose);
	}
	
	private static byte makeChoose() {
		Scanner scan = new Scanner(System.in);
		Helper.printMenu();
		return scan.nextByte();
	}

	private static void selectionProcessing(Coffemachine coffemachine, byte choose) {
		switch (choose) {
		case 1:
			if (!coffemachine.isOn()) {
				Helper.printCoffemachineIsOn();
				coffemachine.setOn(true);
			}
			break;
		case 2:
				clickСount++;
				if (clickСount == 2) {
					Helper.printParting();
					System.exit(42);
				}
				Helper.printCoffemachineIsOff();
				coffemachine.setOn(false);
			break;
		// case 3:
		// if (coffemachine.isOn()) {
		// clickСount = 0;
		// coffemachine.makeCoffe("эспрессо");
		// }
		// break;
		case 3:
			if (coffemachine.isOn()) {
				clickСount = 0;
				coffemachine.makeCoffe("американо");
			}
			break;
		// case 6:
		// if (coffemachine.isOn()) {
		// clickСount = 0;
		// coffemachine.makeCoffe("капучино");
		// }
		// break;
		case 4:
			if (coffemachine.isOn()) {
				clickСount = 0;
				coffemachine.makeCoffe("латте");
			}
			break;
		case 5:
			if (coffemachine.isOn()) {
				clickСount = 0;
				coffemachine.setCurrentAmountOfUsedCoffeeNil();
			}
			break;
		}
	}
}
