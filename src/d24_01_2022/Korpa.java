package d24_01_2022;

import java.util.ArrayList;

public class Korpa {

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public Korpa() {

	}

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
		this.ambalaze = ambalaze;
	}

	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (ambalaze.get(i).barkod.equals(barkod)) {
				ambalaze.remove(i);
			}
		}
	}

	private double cenaSvihAmbalazaSaPopustom(double popust) {
		double suma = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			suma += ambalaze.get(i).cenaArtikla();
		}
		return suma - (suma * popust / 100);
	}

	public double ukupnaCenaKorpe(SuperKartica superkartica) {
		return this.cenaSvihAmbalazaSaPopustom(superkartica.getPopust());
	}

	public void print() {
		System.out.println("Lista artikala u korpi: ");
		System.out.println();
		for (int i = 0; i < ambalaze.size(); i++) {
			ambalaze.get(i).print();
			System.out.println();
		}
	}

}
