package d20_01_2022;

public class Trener extends Osoba{

	private int iskustvo;
	private String tip;
	public Trener() {
		super();

	}
	public Trener(String fullName, String jmbg, int godina, int iskustvo, String tip) {
		super(fullName, jmbg, godina);
		this.iskustvo = iskustvo;
		this.tip = tip;
	}
	public int getIskustvo() {
		return iskustvo;
	}
	public void setIskustvo(int iskustvo) {
		this.iskustvo = iskustvo;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public void print() {
		System.out.println(this.fullName + ", " + this.jmbg + ", " + this.godina);
		System.out.println("Godine iskustva: " + this.iskustvo);
		System.out.println("Tip trenera: " + this.tip);
	}
	
	
	
}
