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

	public int upaljeneRingle() {
		int count = 0;
		if (this.goreLevo.jeUkljucena()) {
			count++;
		}
		if (this.goreDesno.jeUkljucena()) {
			count++;
		}
		if (this.doleLevo.jeUkljucena()) {
			count++;
		}
		if (this.doleDesno.jeUkljucena()) {
			count++;
		}
		return count;
	}

	public void pojacaj(int pozicija) {
		if (this.upaljeneRingle() < this.maxRingli) {
			switch (pozicija) {
			case 1:
				this.goreLevo.pojacajRinglu();
				break;
			case 2:
				this.goreDesno.pojacajRinglu();
				break;
			case 3:
				this.doleLevo.pojacajRinglu();
				break;
			case 4:
				this.doleDesno.pojacajRinglu();
				break;
			default:
				break;
			} // jos uvek pokusavam da izmozgam ovaj deo
		}

	}

	public void iskljuci(int pozicija) {
		switch (pozicija) {
		case 1:
			this.goreLevo.isljuciRinglu();
			break;
		case 2:
			this.goreDesno.isljuciRinglu();
			break;
		case 3:
			this.doleLevo.isljuciRinglu();
			break;
		case 4:
			this.doleDesno.isljuciRinglu();
			break;
		default:
			break;
		}
	}

	public double potrosnja(double vreme) {
		return this.goreLevo.potrosnja(vreme) + this.goreDesno.potrosnja(vreme) + this.doleLevo.potrosnja(vreme)
				+ this.doleDesno.potrosnja(vreme);
	}

	public void print() {
		System.out.println(this.marka + " - " + this.garancija);
		System.out.println("Ringle:");
		System.out.println("Gore levo:");
		this.goreLevo.print();
		System.out.println("Gore desno:");
		this.goreDesno.print();
		System.out.println("Dole levo:");
		this.doleLevo.print();
		System.out.println("Dole desno:");
		this.doleDesno.print();
	}

}
