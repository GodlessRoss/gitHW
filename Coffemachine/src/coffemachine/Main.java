package coffemachine;

import java.util.Scanner;

public class Main {

	static byte clickСount = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Helper.printGreating();
		Coffemachine coffemachine = new Coffemachine(3000, 5000, 500, 3000, 1500);
		preparationForWork(coffemachine);
		startProgramm(coffemachine);
	}

	private static void preparationForWork(Coffemachine coffemachine) {
		Helper.printInstructionsForLackOfCoffee();
		coffemachine.setCurrentAmountOfGroundCoffee(scan.nextInt());
		Helper.printInstructionsForLackOfWhater();
		coffemachine.setCurrentAmountOfWater(scan.nextInt());
		Helper.printInstructionsForLackOfMilk();
		coffemachine.setCurrentAmountOfMilk(scan.nextInt());
		Helper.printInstructionsForLackOfBeansCoffee();
		coffemachine.setCurrentAmountOfBeansCoffee(scan.nextInt());

	}

	private static void startProgramm(Coffemachine coffemachine) {
		if (coffemachine.isOn()) {
			Helper.printState(coffemachine);
		}
		Menu.start(coffemachine);
		startProgramm(coffemachine);
	}

	

}
