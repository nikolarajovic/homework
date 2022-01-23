package d21_01_2022;

public class Sektor {

	private String naziv;
	private double plata;

	public Sektor() {

	}

	public Sektor(String naziv, double plata) {
		super();
		this.naziv = naziv;
		this.plata = plata;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

}
