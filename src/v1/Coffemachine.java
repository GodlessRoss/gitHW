package v1;

import java.util.Scanner;

public class Coffemachine implements MakingEspresso, MakingAmericano {
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
	Scanner scanner = new Scanner(System.in);

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
		int tempAmountOfBeansCoffee = 0;
		switch (nameCoffe) {
		case "эспрессо":
			tempAmountOfGroundCoffee = MakingEspresso.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
			break;
		case "американо":
			tempAmountOfGroundCoffee = MakingAmericano.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingAmericano.NEED_AMOUNT_OF_WATER;
			break;
		case "латте":
			tempAmountOfGroundCoffee = MakingEspresso.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
			System.out.println("Введите количество молока");
			tempAmountOfMilk = scanner.nextInt();
			break;
		case "капучино":
			tempAmountOfGroundCoffee = MakingEspresso.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
			System.out.println("Введите количество молока");
			tempAmountOfMilk = scanner.nextInt();
			break;
		}
		if (currentAmountOfGroundCoffee < tempAmountOfGroundCoffee) {
			Display.printError("not enough ground сoffee", this);
		} else if (currentAmountOfWater < tempAmountOfWater) {
			Display.printError("not enough water", this);
		} else if (maxAmountOfUsedCoffee - currentAmountOfUsedCoffee < tempAmountOfGroundCoffee) {
			Display.printError("too much used сoffee", this);
		} else if (currentAmountOfMilk < tempAmountOfMilk) {
			Display.printError("not enough milk", this);
		} else if (currentAmountOfBeansCoffee < tempAmountOfBeansCoffee) {
			Display.printError("not enough beans coffee", this);
		} else {
			currentAmountOfGroundCoffee -= tempAmountOfGroundCoffee - currentAmountOfBeansCoffee;
			currentAmountOfWater -= tempAmountOfWater;
			currentAmountOfUsedCoffee += tempAmountOfGroundCoffee;
			currentAmountOfMilk -= tempAmountOfMilk;
			currentAmountOfBeansCoffee -= currentAmountOfBeansCoffee;// не уверен в
																 // правильности
			Display.printСoffeeMaking(nameCoffe);
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
			System.exit(42);
		}
	}

	public int getCurrentAmountOfMilk() {
		return currentAmountOfMilk;
	}

	public void setCurrentAmountOfMilk(int currentAmountOfMilk) {
		this.currentAmountOfMilk += currentAmountOfMilk;
		if (this.currentAmountOfMilk > maxAmountOfMilk) {
			Display.printFatalError();
			System.exit(42);
		}
	}

	public int getCurrentAmountOfWater() {
		return currentAmountOfWater;
	}

	public void setCurrentAmountOfWater(int currentAmountOfWater) {
		this.currentAmountOfWater += currentAmountOfWater;
		if (this.currentAmountOfWater > maxAmountOfWater) {
			Display.printFatalError();
			System.exit(42);
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
			System.exit(42);
		}

	}

	public int getMaxAmountOfBeansCoffee() {
		return maxAmountOfBeansCoffee;
	}

	public void setMaxAmountOfBeansCoffee(int maxAmountOfBeansCoffee) {
		this.maxAmountOfBeansCoffee = maxAmountOfBeansCoffee;
	}
}
