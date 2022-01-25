package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija,
			boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		return this.placaSeKaucija ? this.osnovnaCena * 1.2 + this.kaucija : this.osnovnaCena * 1.2;
	}

	@Override
	public void print() {
		System.out.println(this.barkod);
		System.out.println(this.naziv + " - " + this.cenaArtikla() + " rsd");
		System.out.println("Bruto tezina: " + this.bruto);
		System.out.println("Neto tezina: " + this.neto);
	}

}
