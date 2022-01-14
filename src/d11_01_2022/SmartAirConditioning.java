package d11_01_2022;

public class SmartAirConditioning {

	public String brand;
	public int consumptionWinterMode;
	public int consumptionSummerMode;
	public int temp;
	public boolean mode;

	public void print() {
		if (this.temp >= 16 && this.temp <= 22 && this.mode == false) {
			System.out.println("*** " + this.brand + " ***");
			System.out.println("Temperature is set at " + this.temp + " degrees.");
			System.out.println("Current mode: Winter");
		} else if (this.temp >= 23 && this.temp <= 35 && this.mode == true){
			System.out.println("*** " + this.brand + " ***");
			System.out.println("Temperature is set at " + this.temp + " degrees.");
			System.out.println("Current mode: Summer");
		} else {
			System.out.println("*** " + this.brand + " ***");
			System.out.println("Invalid mode or temperature.");
			System.out.println("********************");
		}
	}

	public int monthlyConsumption() {
		int monthlyConsumption = 0;
		if (this.mode == true) {
			return monthlyConsumption = 30 * 15 * this.consumptionSummerMode;
		} else if (this.mode == false) {
			return monthlyConsumption = 30 * 15 * this.consumptionWinterMode;
		}
		return monthlyConsumption;
	}

	public int monthlyCosts() {
		int monthlyCosts = 0;
		int blueZone = 0;
		if (this.monthlyConsumption() <= 350) {
			return monthlyCosts *= 6;
		}
		blueZone = this.monthlyConsumption() - 350;
		return monthlyCosts = blueZone * 9 + 350 * 6 ;
	}

}
