package v1;

public class Coffemachine implements MakingEspresso {
	private int maxAmountOfGroundCoffee;
	private int maxAmountOfWater;
	
	private int currentAmountOfGroundCoffee;
	private int currentAmountOfWater;
	
	@Override
	public void makeCoffe(String nameCoffe) {
		switch (nameCoffe) {
		case "espresso":
			System.out.println("Готовлю эспрессо!");
			currentAmountOfGroundCoffee -= NEED_AMOUNT_OF_GROUND_COFFE;
			currentAmountOfWater -= NEED_AMOUNT_OF_WATER;
			System.out.println("Ваш эспрессо готов!");
			break;
		}
	}

}
