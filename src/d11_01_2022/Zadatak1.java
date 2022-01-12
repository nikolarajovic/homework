package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.name = "Sunglasses";
		p1.price = 12990.0;
		p1.weight = 100.0;
		
		p2.name = "Guitar";
		p2.price = 42999.0;
		p2.weight = 2500.0;
		
		p1.print();
		p1.priceIncrease(1000);
		p1.print();
		System.out.println("Discount on your price is " + p1.priceDiscount(30) + " RSD");
		System.out.println("Post price for this product is " + p1.postPrice() + " RSD");
		
		System.out.println();
		
		p2.print();
		p2.priceIncrease(5000);
		p2.print();
		System.out.println("Discount on your price is " + p2.priceDiscount(50) + " RSD");
		System.out.println("Post price for this product is " + p2.postPrice() + " RSD");
		

	}

}
