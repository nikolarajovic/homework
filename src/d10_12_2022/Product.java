package d10_12_2022;

public class Product {

	String name;
	double price;
	double weight;
	
	public void print() {
		System.out.println("{{ " + this.name + " }}" + 
							"{{ " + this.price + " EUR }}" + 
							"{{ " + this.weight + " grams }}");
	}
	
}
