package d20_01_2022;

import java.util.ArrayList;

public class IgracZadatak2 extends Osoba {

	private int broj;
	private String pozicija;
	ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean kapiten;

	public IgracZadatak2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IgracZadatak2(String fullName, String jmbg, int godina, int broj, String pozicija, boolean kapiten) {
		super(fullName, jmbg, godina);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void dodajKarton(Karton karton) {
		kartoni.add(karton);
	}

	public int zutiKartoni() {
		int count = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (kartoni.get(i).getTip().equals("Zuti")) {
				count++;
			}

		}
		return count;
	}

	public int crveniKartoni() {
		int count = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (kartoni.get(i).getTip().equals("Crveni")) {
				count++;
			}

		}
		return count;
	}

	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg + ", " + this.godina);
		System.out.println("Broj zutih: " + this.zutiKartoni());
		System.out.println("Broj crvenih: " + this.crveniKartoni());
	}

}
