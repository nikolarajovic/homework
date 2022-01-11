package d10_12_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.name = "Fridge";
		p1.price = 599.99;
		p1.weight = 15000;
		
		p1.print();
		
		System.out.println();
		
		p2.name = "Table";
		p2.price = 129.99;
		p2.weight = 25400;
		
		p2.print();

	}

}
