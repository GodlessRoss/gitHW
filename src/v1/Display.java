package v1;

public class Display {
	private Coffemachine coffemachine;
	
	public void Message(){
		coffemachine.getCurrentAmountOfGroundCoffee();
		System.out.println("Кофе осталось "+ coffemachine.getCurrentAmountOfGroundCoffee());
		coffemachine.getCurrentAmountOfWater();
		System.out.println("Воды осталось "+ coffemachine.getCurrentAmountOfWater());
		coffemachine.getCurrentAmountOfUsedCoffee();
		System.out.println("Бак с кофе загрунен на "+ coffemachine.getCurrentAmountOfUsedCoffee());
		
		
	}

	
	

	
		
}


