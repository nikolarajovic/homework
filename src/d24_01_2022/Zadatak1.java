package d24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Korpa korpa = new Korpa();
		SuperKartica sk = new SuperKartica("2990", "Carlovski Minic", 18);

		korpa.dodajAmbalazu(new Tetrapak("2040-20209", "Mleko", 500, 600, true, 100));
		korpa.dodajAmbalazu(new Tetrapak("3000-2030", "Slatka pavlaka", 150, 200, false, 90));
		korpa.dodajAmbalazu(new StaklenaAmbalaza("1100-20492", "Jelen Pivo", 250, 350, 20, true, 60));

		sk.print();
		System.out.println();

		korpa.print();

		System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(sk) + " rsd");

	}

}
