package d10_12_2022;

public class SmartAirConditioning {

	String brand;
	int temp;
	String mode;
	
	public void print() {
		
		if (this.temp >= 16 && this.temp <= 35) {
		System.out.println("*** " + this.brand + " ***");
		System.out.println("Temperature is set at " + this.temp + " degrees.");
		System.out.println("Current mode: " + this.mode);
		} else {
			System.out.println("*** " + this.brand + " ***");
			System.out.println("Invalid temperature.");
			System.out.println("********************");
		}
	}
	
}
