package d17_01_2022;

public class Transakcija {

	private String id;
	
	private Racun sender;
	private Racun reciever;
	
	
	public Transakcija(String id, Racun sender, Racun reciever) {
		this.id = id;
		this.sender = sender;
		this.reciever = reciever;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Racun getSender() {
		return sender;
	}
	public void setSender(Racun sender) {
		this.sender = sender;
	}
	public Racun getReciever() {
		return reciever;
	}
	public void setReciever(Racun reciever) {
		this.reciever = reciever;
	}
	
	private double provizija(double iznos) {
		if (iznos < 4500) {
			return 45;
		}
		return iznos * 0.01;
	}
	
	public void izvrsiTransakciju(double iznos) {
		if (this.getSender().getStanje() >= iznos + this.provizija(iznos)) {
			this.getSender().bilansStanja(-(iznos + this.provizija(iznos)));
			this.getReciever().bilansStanja(iznos);
		}
	}
	
	public void print() {
		System.out.println("ID transakcije: " + this.id);
		this.sender.print();
		this.reciever.print();
	}
	
}
