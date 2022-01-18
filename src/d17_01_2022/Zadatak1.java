package d17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<ZeleniKarton> zelenikartoni = new ArrayList<ZeleniKarton>();

		ZeleniKarton zk1 = new ZeleniKarton("Nikola Nikolic", 4422, "Medjunarodna ekonomija", "Dragan Markovic", 9);
		ZeleniKarton zk2 = new ZeleniKarton("Marko Popovic", 4223, "Medjunarodna Ekonomija", "Dragan Markovic", 6);
		ZeleniKarton zk3 = new ZeleniKarton("Nikola Nikolodovic", 4555, "Osnove ekonomije", "Zoran Radic", 5);
		ZeleniKarton zk4 = new ZeleniKarton("Jelena Markovic", 3999, "Upravljanje perfomansama preduzeca",
				"Zorica Danic", 8);
		ZeleniKarton zk5 = new ZeleniKarton("Dejan Dulic", 4667, "Medjunarodno pravo", "Danica Maric", 10);
		
		zelenikartoni.add(zk1);
		zelenikartoni.add(zk2);
		zelenikartoni.add(zk3);
		zelenikartoni.add(zk4);
		zelenikartoni.add(zk5);
		
		for (int i = 0; i < zelenikartoni.size(); i++) {
			zelenikartoni.get(i).print();
			System.out.println("--------");
		}
		
		double sum1 = 0;
		for (int i = 0; i < zelenikartoni.size(); i++) {
			sum1 += zelenikartoni.get(i).getOcena();
		}
		double average = sum1/ zelenikartoni.size();
		
		System.out.println("Prosecna ocena: " + average);
		
		double sum2 = 0;
		double count = 0;
		for (int i = 0; i < zelenikartoni.size(); i++) {
			if (zelenikartoni.get(i).jePolozen() == true) {
				sum2 += zelenikartoni.get(i).getOcena();
				count++;
			}
		}
		
		double averagePassed = sum2 / count;
		
		System.out.println("Prosecna ocena polozenih ispita: " + averagePassed);

	}

}
