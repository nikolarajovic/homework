package d14_01_2022;

public class Vaga {

	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}
	
	public String getMernaJedinica() {
		return this.mernaJedinica;
	}
	
	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}
	
	public Proizvod getProizvod() {
		return this.proizvod;
	}
	
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu(double tezina) {
		
		if (this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		} else if (this.mernaJedinica.equals("lb")) {
			return this.proizvod.getCenaLb() * (tezina / 2.2046);
		} 
		return 0;
	}
	
	public void print(double tezina) {
		this.proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + "rsd, " + this.mernaJedinica + " " + tezina);
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.proizvod.getCenaLb() + "rsd, " + this.mernaJedinica + " " + tezina);
		} 
		System.out.println("Ukupno: " + this.sracunajCenu(tezina) + "rsd");
	}
	
}
