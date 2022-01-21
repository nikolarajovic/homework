package d18_01_2022;

import java.util.ArrayList;

public class Kombinacija {

	private String id;
	private int jedan;
	private int dva;
	private int tri;
	private int cetiri;
	private int pet;
	private int sest;
	private int sedam;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

	public Kombinacija(String id, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
		this.id = id;

		this.jedan = jedan;
		this.dva = dva;
		this.tri = tri;
		this.cetiri = cetiri;
		this.pet = pet;
		this.sest = sest;
		this.sedam = sedam;

		nizBrojeva.add(jedan);
		nizBrojeva.add(dva);
		nizBrojeva.add(tri);
		nizBrojeva.add(cetiri);
		nizBrojeva.add(pet);
		nizBrojeva.add(sest);
		nizBrojeva.add(sedam);
	}

	public String getId() {
		return id;
	}

	public int getJedan() {
		return jedan;
	}

	public int getDva() {
		return dva;
	}

	public int getTri() {
		return tri;
	}

	public int getCetiri() {
		return cetiri;
	}

	public int getPet() {
		return pet;
	}

	public int getSest() {
		return sest;
	}

	public int getSedam() {
		return sedam;
	}

	public ArrayList<Integer> getNizBrojeva() {
		return nizBrojeva;
	}

	public boolean daLiJeIstaKombinacija(Kombinacija kombinacija) {
		for (int i = 0; i < this.nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) == kombinacija.getNizBrojeva().get(i)) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		System.out.println("ID: " + this.id);
		System.out.print("Brojevi: ");
		for (int i = 0; i < this.nizBrojeva.size(); i++) {
			System.out.print(this.nizBrojeva.get(i) + ", ");
		}
		System.out.println();
	}

}
