package d20_01_2022;

public class Igrac extends Osoba {

	private int broj;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Igrac(String fullName, String jmbg, int godina, int broj, String pozicija, boolean kapiten) {
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

	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg + ", " + this.godina);
		System.out.println("Broj dresa: " + this.broj);
		System.out.println("Pozicija: " + this.pozicija);
		if (this.kapiten) {
			System.out.println("Igrac je kapiten tima.");
		} else {
			System.out.println("Igrac nije kapiten tima.");
		}
	}

}
