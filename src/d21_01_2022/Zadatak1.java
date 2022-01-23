package d21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Menadzer menadz = new Menadzer("Nick Nickovski");
		Magacioner magac = new Magacioner("Pera Antic");
		
		menadz.zaposliUSektor(new Sektor("Prodaja", 50000));
		menadz.zaposliUSektor(new Sektor("Marketing", 60000));
		menadz.zaposliUSektor(new Sektor("Transport", 70000));
		menadz.zaposliUSektor(new Sektor("Prodaja", 90000));

		magac.zaposliUSektor(new Sektor("Prodaja", 30000));
		magac.zaposliUSektor(new Sektor("Logistika", 40000));
		magac.zaposliUSektor(new Sektor("Logistika", 50000));
		magac.zaposliUSektor(new Sektor("Prodaja", 60000));
		
		System.out.println("Plata menadzera " + menadz.getFullName() + " je " + menadz.plataRadnika() + ".");
		System.out.println();
		System.out.println("Plata magacionera " + magac.getFullName() + " je " + magac.plataRadnika() + ".");
	}

}
