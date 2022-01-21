package d20_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Igrac igrac1 = new Igrac("Marko Simonovic", "2124999201049", 1992, 25, "Krilo", true);
		Igrac igrac2 = new Igrac("Jovan Jokic", "2491923424959", 1999, 10, "Srednji bek", false);

		igrac1.print();
		System.out.println();
		igrac2.print();

		System.out.println();
		
		Trener trener1 = new Trener("Jovica Markovic", "294929191489", 1979, 10, "Kondicioni");
		Trener trener2 = new Trener("Dusan Rukic", "2021049490", 1989, 3, "Personalni");

		trener1.print();
		System.out.println();
		trener2.print();
	}

}
