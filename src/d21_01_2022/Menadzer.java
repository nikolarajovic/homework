package d21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

	public Menadzer(String fullName) {
		super(fullName);
	}

	@Override
	public double plataRadnika() {
		double plata = 0;
		for (int i = 0; i < this.getSektori().size(); i++) {
			plata += this.getSektori().get(i).getPlata();
		}
		return plata;
	}

}
