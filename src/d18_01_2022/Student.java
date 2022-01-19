package d18_01_2022;

import java.util.ArrayList;

public class Student {

	private int brojIndeksa;
	private String fullName;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int brojIndeksa, String fullName, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.fullName = fullName;
		this.tipStudija = tipStudija;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(String naziv, int ocena, String profesor) {
		ispiti.add(new Ispit(naziv, ocena, profesor));
	}

	public int prosek() {
		int sum = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (ispiti.get(i).jePolozen() == true) {
				sum += ispiti.get(i).getOcena();
			}
		}
		return sum / ispiti.size();
	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.fullName + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			ispiti.get(i).print();			
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}

}
