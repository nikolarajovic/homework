package d24_01_2022;

public abstract class Ambalaza {

	protected String barkod;
	protected String naziv;
	protected double neto;
	protected double bruto;

	public Ambalaza() {

	}

	public Ambalaza(String barkod, String naziv, double neto, double bruto) {
		this.barkod = barkod;
		this.naziv = naziv;
		this.neto = neto;
		this.bruto = bruto;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public double getBruto() {
		return bruto;
	}

	public void setBruto(double bruto) {
		this.bruto = bruto;
	}

	public double tezinaPakovanja() {
		return this.bruto - this.neto;
	}

	public abstract double cenaArtikla();

	public abstract void print();

}
