package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Racun sender = new Racun("2991 48912488 12894", "Nick Nickic", 46040);
		Racun reciever = new Racun("2194 4858888 41274", "Radojka Mitic", 34400);
		Transakcija transakcija = new Transakcija("333", sender, reciever);
		
		transakcija.print();
		
		System.out.println();
		transakcija.izvrsiTransakciju(5000);
		transakcija.print();

	}

}
