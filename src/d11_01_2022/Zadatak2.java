package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning sac1 = new SmartAirConditioning();
		SmartAirConditioning sac2 = new SmartAirConditioning();
		
		sac1.brand = "LG";
		sac1.temp = 30;
		sac1.mode = true;
		sac1.consumptionSummerMode = 3;
		sac1.consumptionWinterMode = 1;
		
		sac2.brand = "Panasonic";
		sac2.temp = 18;
		sac2.mode = false;
		sac2.consumptionSummerMode = 2;
		sac2.consumptionWinterMode = 1;
		
		sac1.print();
		System.out.println("Monthly consumption for this SAC is " + sac1.monthlyConsumption() + " kW/h.");
		System.out.println("Monthly costs for this SAC is " + sac1.monthlyCosts() + " RSD.");
		
		System.out.println();
		
		sac2.print();
		System.out.println("Monthly consumption for this SAC is " + sac2.monthlyConsumption() + " kW/h.");
		System.out.println("Monthly costs for this SAC is " + sac2.monthlyCosts() + " RSD.");
		
	}
}
