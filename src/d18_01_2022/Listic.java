package d18_01_2022;

import java.util.ArrayList;

public class Listic {

	ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();

	public void dodajKombinaciju(Kombinacija kombinacije) {
		this.kombinacije.add(kombinacije);
	}

	public boolean jeDobitnaKombinacija(Kombinacija kombinacija) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			if (this.kombinacije.get(i).daLiJeIstaKombinacija(kombinacija) == true) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			this.kombinacije.get(i).print();
		}
	}
}
