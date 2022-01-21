package d20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();

		System.out.print("Unesite broj igraca: ");
		int n = s.nextInt();
		s.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("Ime igraca: ");
			String fullName = s.nextLine();
			System.out.println("JMBG: ");
			String jmbg = s.nextLine();
			System.out.println("Godiste: ");
			int godina = s.nextInt();
			System.out.println("Broj dresa: ");
			int broj = s.nextInt();
			s.nextLine();
			System.out.println("Pozicija: ");
			String pozicija = s.nextLine();
			System.out.println("Kapiten: ");
			boolean kapiten = s.nextBoolean();

			igraci.add(new Igrac(fullName, jmbg, godina, broj, pozicija, kapiten));
		}

		System.out.print("Unesite broj trenera: ");
		int y = s.nextInt();
		s.nextLine();

		for (int i = 0; i < y; i++) {

			System.out.println("Ime trenera: ");
			String fullName = s.nextLine();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godiste: ");
			int godina = s.nextInt();
			System.out.println("Godine iskustva: ");
			int iskustvo = s.nextInt();
			s.nextLine();
			System.out.println("Tip trenera: ");
			String tip = s.nextLine();

			treneri.add(new Trener(fullName, jmbg, godina, iskustvo, tip));
		}

		for (int i = 0; i < igraci.size(); i++) {
			System.out.println();
			igraci.get(i).print();
			System.out.println("--------");
		}

		for (int i = 0; i < treneri.size(); i++) {
			System.out.println();
			treneri.get(i).print();
			System.out.println("--------");
		}
	}

}
