public class MoneyApp {

	private static double incomePerDay = 699; //dollars
	
	public static void main(String[] args) {
		
		System.out.println("bonus: " + getBonus() + " dollars");
		System.out.println("Fee for Upwork(paid by wiki): " + payFee() + " dollars");
		System.out.println("how much money I've earend: " + earned() + "dollars");
		

	}

	public static double getBonus() {
		return incomePerDay * 0.2;
	}
	public static double payFee() {
		return incomePerDay * 0.1;
	}
	public static double earned() {
		return incomePerDay + getBonus();
		
	}
}	
