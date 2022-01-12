package d11_01_2022;

public class Product {

	String name;
	double price;
	double weight;
	
	public void print() {
		System.out.println(name + " - " + price + " RSD - " + weight + " grams");
	}
	
	public void priceIncrease(double increase) {
		this.price += increase;
	}
	
	public double priceDiscount(double discount) {
		return this.price / 100 * discount;
	}
	
	public double postPrice() {
		double postPrice = 0;
		if (this.weight <= 100) {
			return postPrice = 200;
		} else if (this.weight <= 500) {
			return postPrice = 400;
		}
		return postPrice = 1000;
	}
	
}
