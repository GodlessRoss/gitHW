package v1;

public class Coffemachine implements MakingEspresso, MakingAmericano {
	private int maxAmountOfGroundCoffee;
	private int maxAmountOfWater;
	private int maxAmountOfUsedCoffee;

	private boolean isOn = false;

	private int currentAmountOfGroundCoffee;
	private int currentAmountOfWater;
	private int currentAmountOfUsedCoffee = 0;

	public void makeCoffe(String nameCoffe) {
		int tempAmountOfGroundCoffee = 0;
		int tempAmountOfWater = 0;
		switch (nameCoffe) {
		case "эспрессо":
			tempAmountOfGroundCoffee = MakingEspresso.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
			break;
		case "американо":
			tempAmountOfGroundCoffee = MakingAmericano.NEED_AMOUNT_OF_GROUND_COFFE;
			tempAmountOfWater = MakingAmericano.NEED_AMOUNT_OF_WATER;
			break;
		}
		if (currentAmountOfGroundCoffee < tempAmountOfGroundCoffee) {
			Display.printError("not enough ground сoffee", this);
		} else if (currentAmountOfWater < tempAmountOfWater) {
			Display.printError("not enough water", this);
		} else if (maxAmountOfUsedCoffee - currentAmountOfUsedCoffee < tempAmountOfGroundCoffee) {
			Display.printError("too much used сoffee", this);
		} else {
			currentAmountOfGroundCoffee -= tempAmountOfGroundCoffee;
			currentAmountOfWater -= tempAmountOfWater;
			currentAmountOfUsedCoffee += tempAmountOfGroundCoffee;
			Display.printСoffeeMaking(nameCoffe);
		}
	}

	public Coffemachine(int maxAmountOfGroundCoffee, int maxAmountOfWater, int maxAmountOfUsedCoffee) {
		this.maxAmountOfGroundCoffee = maxAmountOfGroundCoffee;
		this.maxAmountOfWater = maxAmountOfWater;
		this.maxAmountOfUsedCoffee = maxAmountOfUsedCoffee;
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

}
