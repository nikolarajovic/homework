package d20_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		IgracZadatak2 igrac = new IgracZadatak2("Nick Nickovski", "123333441", 1992, 25, "Bek", true);
		
		igrac.dodajKarton(new Karton("Zuti"));
		igrac.dodajKarton(new Karton("Zuti"));
		igrac.dodajKarton(new Karton("Zuti"));
		igrac.dodajKarton(new Karton("Crveni"));
		
		igrac.print();

	}

}
