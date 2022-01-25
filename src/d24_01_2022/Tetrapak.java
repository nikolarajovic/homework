package d24_01_2022;

public class Tetrapak extends Ambalaza {

	private boolean reciklaza;
	private double osnovnaCena;

	public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean reciklaza, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		return this.reciklaza ? this.tezinaPakovanja() * 1.5 + this.osnovnaCena : this.osnovnaCena;
	}

	@Override
	public void print() {
		System.out.println(this.barkod);
		System.out.println(this.naziv + " - " + this.cenaArtikla() + " rsd");
		System.out.println("Bruto tezina: " + this.bruto);
		System.out.println("Neto tezina: " + this.neto);
	}

}
