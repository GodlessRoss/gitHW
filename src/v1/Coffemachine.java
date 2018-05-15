package v1;

public class Coffemachine implements MakingEspresso {
	private int maxAmountOfGroundCoffee;
	private int maxAmountOfWater;

	private int currentAmountOfGroundCoffee;
	private int currentAmountOfWater;

	@Override
	public void makeCoffe(String nameCoffe) {
		int bufferAmountOfGroundCoffee = 0;
		int bufferAmountOfWater = 0;
		switch (nameCoffe) {
		case "эспрессо":
			bufferAmountOfGroundCoffee = MakingEspresso.NEED_AMOUNT_OF_GROUND_COFFE;
			bufferAmountOfWater = MakingEspresso.NEED_AMOUNT_OF_WATER;
			break;
		}
		System.out.println("Начинаю готовить " + nameCoffe);
		currentAmountOfGroundCoffee -= bufferAmountOfGroundCoffee;
		currentAmountOfWater -= currentAmountOfWater;
		System.out.println("Ваш " + nameCoffe + " готов.");
	}

}
