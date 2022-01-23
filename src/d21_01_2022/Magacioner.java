package d21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	public Magacioner(String fullName) {
		super(fullName);
		// TODO Auto-generated constructor stub
	}

	private double prosecnaPlata() {
		double plata = 0;
		for (int i = 0; i < this.getSektori().size(); i++) {
			plata += this.getSektori().get(i).getPlata();

		}
		return plata / this.getSektori().size() * 0.5;
	}

	@Override
	public double plataRadnika() {
		return this.prosecnaPlata() * this.getSektori().size();
	}

}
