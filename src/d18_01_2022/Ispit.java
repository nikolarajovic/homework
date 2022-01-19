package d18_01_2022;

public class Ispit {

	private String naziv;
	private int ocena;
	private String profesor;

	public Ispit(String naziv, int ocena, String profesor) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public boolean jePolozen() {
		return this.ocena > 5;
	}

	public void print() {
		System.out.println(this.naziv + " - " + this.profesor + " - " + this.ocena);
	}

}
