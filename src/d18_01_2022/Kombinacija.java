package d18_01_2022;

import java.util.ArrayList;

public class Kombinacija {

	private String id;
	private int jedan;
	private int dva;
	private int tri;
	private int cetri;
	private int pet;
	private int sest;
	private int sedam;
	private ArrayList<Integer> kombinacija = new ArrayList<Integer>();
	
	public Kombinacija(String id, int jedan, int dva, int tri, int cetri, int pet, int sest, int sedam) {
		this.id = id;
		kombinacija.add(jedan);
		kombinacija.add(dva);
		kombinacija.add(tri);
		kombinacija.add(cetri);
		kombinacija.add(pet);
		kombinacija.add(sest);
		kombinacija.add(sedam);
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

	public int getCetri() {
		return cetri;
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

	public ArrayList<Integer> getKombinacija() {
		return kombinacija;
	}
	

	

}
