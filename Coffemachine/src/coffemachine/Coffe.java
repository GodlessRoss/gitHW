package coffemachine;

public class Coffe {

	public static int AMOUNT_GROUND_COFFE = 22;
	public static int ESPRESSO_AMOUNT_OF_WATER = 30;
	public static int AMERICANO_AMOUNT_OF_WATER = 100;
	private boolean isHasFoam;
	private int amountMilk;

	public int getAmountMilk() {
		return amountMilk;
	}

	public void setAmountMilk(int amountMilk) {
		this.amountMilk = amountMilk;
	}
	
	public boolean isHasFoam() {
		return isHasFoam;
	}

	public void setHasFoam(boolean isHasFoam) {
		this.isHasFoam = isHasFoam;
	}
	
}
