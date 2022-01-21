package d17_01_2022;

public class Ringla {

	private String tip;
	private int jacina;
	private double jacinaGrejaca;

	public Ringla(String tip, double jacinaGrejaca) {
		this.tip = tip;
		this.jacinaGrejaca = jacinaGrejaca;
		this.jacina = 0;
	}

	public int getJacina() {
		return jacina;
	}

	private int maxJacina() {
		return this.tip.equals("Obican") ? 3 : 13;
	}

	public void pojacajRinglu() {
		if (this.jacina < this.maxJacina()) {
			this.jacina++;
		}
	}

	public void isljuciRinglu() {
		this.jacina = 0;
	}

	public boolean jeUkljucena() {
		return this.jacina > 0;
	}

	public double potrosnja(double vreme) {
		return 100 / this.maxJacina() * this.jacina * this.jacinaGrejaca * vreme;
	}

	public void print() {
		if (this.jeUkljucena() == true) {
			System.out.println("Ringla je ukljucena.");
		} else {
			System.out.println("Ringla je isljucena.");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejaca);
	}

}
