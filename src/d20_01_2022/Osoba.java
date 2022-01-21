package d20_01_2022;

public class Osoba {

	protected String fullName;
	protected String jmbg;
	protected int godina;
	
	public Osoba() {

	}

	public Osoba(String fullName, String jmbg, int godina) {
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.godina = godina;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg + ", " + this.godina);
	}
	
}
