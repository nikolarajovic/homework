package d10_12_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning sac1 = new SmartAirConditioning();
		SmartAirConditioning sac2 = new SmartAirConditioning();
		
		sac1.brand = "Xiaomi";
		sac1.temp = 30;
		sac1.mode = "Summer";
		
		sac1.print();
		
		System.out.println();
		
		sac2.brand = "Samsung";
		sac2.temp = 15;
		sac2.mode = "Winter";
		
		sac2.print();

	}

}
