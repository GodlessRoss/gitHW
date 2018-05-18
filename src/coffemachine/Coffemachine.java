package coffemachine;

import java.util.Scanner;

public class Coffemachine implements MakingAmericano, MakingLate, MakingCappuccino {
	Scanner scanner = new Scanner(System.in);

	private int maxAmountOfGroundCoffee;
	private int maxAmountOfWater;
	private int maxAmountOfUsedCoffee;
	private int maxAmountOfMilk;
	private int maxAmountOfBeansCoffee;

	private boolean isOn = false;

	private int currentAmountOfGroundCoffee;
	private int currentAmountOfWater;
	private int currentAmountOfUsedCoffee = 0;
	private int currentAmountOfMilk;
	private int currentAmountOfBeansCoffee;

	public int getMaxAmountOfMilk() {
		return maxAmountOfMilk;
	}

	public void setMaxAmountOfMilk(int maxAmountOfMilk) {
		this.maxAmountOfMilk = maxAmountOfMilk;
	}

	public void makeCoffe(String nameCoffe) {
		int tempAmountOfGroundCoffee = 0;
		int tempAmountOfWater = 0;
		int tempAmountOfMilk = 0;
		boolean isHasFoat = false;
		switch (nameCoffe) {
		// case "эспрессо":
		// tempAmountOfGroundCoffee = NEED_AMOUNT_OF_GROUND_COFFE;
		// tempAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
		// break;
		case "американо":
			tempAmountOfGroundCoffee = NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingAmericano.NEED_AMOUNT_OF_WATER;
			break;
		// case "капучино":
		// tempAmountOfGroundCoffee = NEED_AMOUNT_OF_GROUND_COFFE;
		// tempAmountOfWater = MakingCappuccino.NEED_AMOUNT_OF_WATER;
		// System.out.println("Введите количество молока");
		// tempAmountOfMilk = scanner.nextInt();
		// isHasFoat = MakingCappuccino.IS_HAS_FOAM;
		// break;
		case "латте":
			tempAmountOfGroundCoffee = NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingLate.NEED_AMOUNT_OF_WATER;
			System.out.print("Введите количество молока\n > ");
			tempAmountOfMilk = scanner.nextInt();
			isHasFoat = MakingLate.IS_HAS_FOAM;
			break;
		}
		grindCoffee();
		if (currentAmountOfGroundCoffee < tempAmountOfGroundCoffee) {
			Display.printError("not enough ground сoffee", this);
			Display.printError("not enough beans coffee", this);
		} else if (currentAmountOfWater < tempAmountOfWater) {
			Display.printError("not enough water", this);
		} else if (maxAmountOfUsedCoffee - currentAmountOfUsedCoffee < tempAmountOfGroundCoffee) {
			Display.printError("too much used сoffee", this);
		} else if (currentAmountOfMilk < tempAmountOfMilk) {
			Display.printError("not enough milk", this);
		} else {
			currentAmountOfGroundCoffee -= tempAmountOfGroundCoffee;
			currentAmountOfWater -= tempAmountOfWater;
			currentAmountOfUsedCoffee += tempAmountOfGroundCoffee;
			currentAmountOfMilk -= tempAmountOfMilk;
			Display.printСoffeeMaking(nameCoffe, isHasFoat, tempAmountOfMilk);
		}
	}

	private void grindCoffee() {
		int necessaryToFallAsleep = maxAmountOfGroundCoffee - currentAmountOfGroundCoffee;
		if (currentAmountOfBeansCoffee == 0) {
			return;
		}
		if (currentAmountOfBeansCoffee > necessaryToFallAsleep) {
			currentAmountOfBeansCoffee -= necessaryToFallAsleep;
			currentAmountOfGroundCoffee += necessaryToFallAsleep;
		} else {
			currentAmountOfGroundCoffee += currentAmountOfBeansCoffee;
			currentAmountOfBeansCoffee = 0;
		}
	}

	public Coffemachine(int maxAmountOfGroundCoffee, int maxAmountOfWater, int maxAmountOfUsedCoffee,
			int maxAmountOfMilk, int maxAmountOfBeansCoffee) {
		this.maxAmountOfGroundCoffee = maxAmountOfGroundCoffee;
		this.maxAmountOfWater = maxAmountOfWater;
		this.maxAmountOfUsedCoffee = maxAmountOfUsedCoffee;
		this.maxAmountOfMilk = maxAmountOfMilk;
		this.maxAmountOfBeansCoffee = maxAmountOfBeansCoffee;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getCurrentAmountOfGroundCoffee() {
		return currentAmountOfGroundCoffee;
	}

	public void setCurrentAmountOfGroundCoffee(int currentAmountOfGroundCoffee) {
		this.currentAmountOfGroundCoffee += currentAmountOfGroundCoffee;
		if (this.currentAmountOfGroundCoffee > maxAmountOfGroundCoffee) {
			Display.printFatalError();
			Display.printToFinishWork();
			char choose = scanner.next().charAt(0);
			if ('Y' == choose) {
				System.exit(42);
			}
			this.currentAmountOfGroundCoffee -= currentAmountOfGroundCoffee;
			Display.printError("not enough ground сoffee", this);
			;
		}
	}

	public int getCurrentAmountOfMilk() {
		return currentAmountOfMilk;
	}

	public void setCurrentAmountOfMilk(int currentAmountOfMilk) {
		this.currentAmountOfMilk += currentAmountOfMilk;
		if (this.currentAmountOfMilk > maxAmountOfMilk) {
			Display.printFatalError();
			Display.printToFinishWork();
			char choose = scanner.next().charAt(0);
			if ('Y' == choose) {
				System.exit(42);
			}
			this.currentAmountOfMilk -= currentAmountOfMilk;
			Display.printError("not enough milk", this);
			;
		}
	}

	public int getCurrentAmountOfWater() {
		return currentAmountOfWater;
	}

	public void setCurrentAmountOfWater(int currentAmountOfWater) {
		this.currentAmountOfWater += currentAmountOfWater;
		if (this.currentAmountOfWater > maxAmountOfWater) {
			Display.printFatalError();
			Display.printToFinishWork();
			char choose = scanner.next().charAt(0);
			if ('Y' == choose) {
				System.exit(42);
			}
			this.currentAmountOfWater -= currentAmountOfWater;
			Display.printError("not enough water", this);
		}
	}

	public int getCurrentAmountOfUsedCoffee() {
		return currentAmountOfUsedCoffee;
	}

	public void setCurrentAmountOfUsedCoffeeNil() {
		currentAmountOfUsedCoffee = 0;
	}

	public int getMaxAmountOfGroundCoffee() {
		return maxAmountOfGroundCoffee;
	}

	public int getMaxAmountOfWater() {
		return maxAmountOfWater;
	}

	public int getMaxAmountOfUsedCoffee() {
		return maxAmountOfUsedCoffee;
	}

	public int getCurrentAmountOfBeansCoffee() {
		return currentAmountOfBeansCoffee;
	}

	public void setCurrentAmountOfBeansCoffee(int currentAmountOfBeansCoffee) {
		this.currentAmountOfBeansCoffee += currentAmountOfBeansCoffee;
		if (this.currentAmountOfBeansCoffee > maxAmountOfBeansCoffee) {
			Display.printFatalError();
			Display.printToFinishWork();
			char choose = scanner.next().charAt(0);
			if ('Y' == choose) {
				System.exit(42);
			}
			this.currentAmountOfBeansCoffee -= currentAmountOfBeansCoffee;
			Display.printError("not enough beans coffee", this);
			;
		}

	}

	public int getMaxAmountOfBeansCoffee() {
		return maxAmountOfBeansCoffee;
	}

	public void setMaxAmountOfBeansCoffee(int maxAmountOfBeansCoffee) {
		this.maxAmountOfBeansCoffee = maxAmountOfBeansCoffee;
	}
}
