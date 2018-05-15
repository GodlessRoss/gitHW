package v1;

public class Coffemachine implements MakingEspresso {
	private int maxAmountOfGroundCoffee;
	private int maxAmountOfWater;
	private int maxAmountOfUsedCoffee;

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
			System.out.println("ошибка: Отсутствует молотый кофе!");
		} else if (currentAmountOfWater < tempAmountOfWater) {
			System.out.println("ошибка: Отсутствует вода!");
		} else if (maxAmountOfUsedCoffee - currentAmountOfUsedCoffee < tempAmountOfGroundCoffee) {
			System.out.println("Переполнен бак с отработанным кофе");
		} else {
			System.out.println("Начинаю готовить " + nameCoffe);
			currentAmountOfGroundCoffee -= tempAmountOfGroundCoffee;
			currentAmountOfWater -= tempAmountOfWater;
			currentAmountOfUsedCoffee += tempAmountOfGroundCoffee;
			System.out.println("Ваш " + nameCoffe + " готов.");
		}
	}

	public int getMaxAmountOfGroundCoffee() {
		return maxAmountOfGroundCoffee;
	}

	public void setMaxAmountOfGroundCoffee(int maxAmountOfGroundCoffee) {
		this.maxAmountOfGroundCoffee = maxAmountOfGroundCoffee;
	}

	public int getMaxAmountOfWater() {
		return maxAmountOfWater;
	}

	public void setMaxAmountOfWater(int maxAmountOfWater) {
		this.maxAmountOfWater = maxAmountOfWater;
	}

	public int getMaxAmountOfUsedCoffee() {
		return maxAmountOfUsedCoffee;
	}

	public void setMaxAmountOfUsedCoffee(int maxAmountOfUsedCoffee) {
		this.maxAmountOfUsedCoffee = maxAmountOfUsedCoffee;
	}

	public int getCurrentAmountOfGroundCoffee() {
		return currentAmountOfGroundCoffee;
	}

	public void setCurrentAmountOfWater(int currentAmountOfWater) {
		if (currentAmountOfGroundCoffee > maxAmountOfGroundCoffee) {
			System.out.println("Заданны неверные параметры");
			System.exit(42);
		}
		this.currentAmountOfWater = currentAmountOfWater;
	}

	public int getCurrentAmountOfUsedCoffee() {
		return currentAmountOfUsedCoffee;
	}

	public void setCurrentAmountOfUsedCoffee(int currentAmountOfUsedCoffee) {
		if (currentAmountOfUsedCoffee > maxAmountOfGroundCoffee) {
			System.out.println("Заданны неверные параметры");
			System.exit(42);
		}
		this.currentAmountOfUsedCoffee = currentAmountOfUsedCoffee;
	}

}
