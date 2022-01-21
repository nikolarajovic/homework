package d18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Kombinacija kombinacija1 = new Kombinacija("askfjaskfj", 3, 4, 5, 6, 7, 8, 9);
		Kombinacija kombinacija2 = new Kombinacija("asklfkaslas", 10, 12, 13, 14, 15, 16, 17);
		Kombinacija kombinacija3 = new Kombinacija("askjlflasjf", 20, 21, 22, 23, 24, 25, 26);
		Kombinacija kombinacija4 = new Kombinacija("alskjflkas", 21, 22, 23, 24, 25, 26, 27);
		Kombinacija kombinacija5 = new Kombinacija("alskflkjas", 9, 10, 11, 12, 13, 14, 15);
		Kombinacija kombinacija6 = new Kombinacija("alskjfklasj", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija kombinacija7 = new Kombinacija("alskjfklasj", 2, 3, 4, 5, 6, 7, 8);
		Kombinacija dobitnaKombinacija = new Kombinacija("alskflkjas", 9, 10, 11, 12, 13, 14, 15);
		
		Listic listic = new Listic();

		listic.dodajKombinaciju(kombinacija1);
		listic.dodajKombinaciju(kombinacija2);
		listic.dodajKombinaciju(kombinacija3);
		listic.dodajKombinaciju(kombinacija4);
		listic.dodajKombinaciju(kombinacija5);
		listic.dodajKombinaciju(kombinacija6);
		listic.dodajKombinaciju(kombinacija7);

		listic.print();
		System.out.println();

		if (listic.jeDobitnaKombinacija(dobitnaKombinacija)) {
			System.out.println("CESTITAMO!");
		} else {
			System.out.println("Ipak niste dobili.");
		}

	}

}
