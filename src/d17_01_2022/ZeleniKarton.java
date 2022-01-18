package d17_01_2022;

public class ZeleniKarton {

	private String fullName;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String fullNameProfesora;
	private int ocena;

	public ZeleniKarton(String fullName, int brojIndeksa, String nazivPredmeta, 
						String fullNameProfesora, int ocena) {
		this.fullName = fullName;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.fullNameProfesora = fullNameProfesora;
		this.ocena = ocena;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getFullNameProfesora() {
		return fullNameProfesora;
	}

	public void setFullNameProfesora(String fullNameProfesora) {
		this.fullNameProfesora = fullNameProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		if (ocena > 5 && ocena <= 10)
		this.ocena = ocena;
	}
	
	public boolean jePolozen() {
		return this.ocena > 5 && this.ocena <= 10;
	}
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.fullName + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.fullNameProfesora);
	}

}
