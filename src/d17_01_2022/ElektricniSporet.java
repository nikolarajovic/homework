package d17_01_2022;

public class ElektricniSporet {

	private String marka;
	private int garancija;
	private int maxRingli;
	
	private Ringla doleLevo;
	private Ringla doleDesno;
	private Ringla goreLevo;
	private Ringla goreDesno;
	
	public ElektricniSporet(String marka, int garancija, int maxRingli, Ringla doleLevo, Ringla doleDesno,
			Ringla goreLevo, Ringla goreDesno) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxRingli = maxRingli;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
	}
	public String getMarka() {
		return marka;
	}
	public int getGarancija() {
		return garancija;
	}
	public int getMaxRingli() {
		return maxRingli;
	}
	public Ringla getDoleLevo() {
		return doleLevo;
	}
	public Ringla getDoleDesno() {
		return doleDesno;
	}
	public Ringla getGoreLevo() {
		return goreLevo;
	}
	public Ringla getGoreDesno() {
		return goreDesno;
	}
	
	public void pojacaj(int pozicija) {
		
	}
	
	
	
}
