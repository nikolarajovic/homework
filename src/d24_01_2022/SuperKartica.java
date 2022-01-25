package d24_01_2022;

public class SuperKartica {

	private String broj;
	private String fullName;
	private double popust;
	
	public SuperKartica(String broj, String fullName, double popust) {
		this.broj = broj;
		this.fullName = fullName;
		this.popust = popust;
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

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	public void print() {
		System.out.print("SuperKartica: ");
		System.out.println(this.broj + ", " + this.fullName);
	}
	
}
