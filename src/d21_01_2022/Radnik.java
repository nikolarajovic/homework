package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {

	private String fullName;
	private ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public Radnik(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}

	public abstract double plataRadnika();

	public void zaposliUSektor(Sektor sektor) {
		sektori.add(sektor);
	}

}
