package d17_01_2022;

public class Racun {

	private String broj;
	private String fullName;
	private double stanje;

	public Racun(String broj, String fullName, double stanje) {
		this.broj = broj;
		this.fullName = fullName;
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getStanje() {
		return stanje;
	}

	public void transakcija(double iznos) {
		if (this.stanje > iznos) {
			this.stanje += iznos;
		}
	}

	public void print() {
		System.out.println(this.fullName + " - " + this.broj);
		System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
	}

}
