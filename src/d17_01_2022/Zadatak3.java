package d17_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		Ringla goreLevo = new Ringla("Obican", 1);
		Ringla goreDesno = new Ringla("Obican", 1.2);
		Ringla doleLevo = new Ringla("Obican", 1);
		Ringla doleDesno = new Ringla("Obican", 1);
		ElektricniSporet eSporet = new ElektricniSporet("Bosh", 3, 4, doleLevo, 
														doleDesno, goreLevo, goreDesno);
		
		eSporet.print();
		
		eSporet.pojacaj(1);
		eSporet.pojacaj(2);
		eSporet.pojacaj(2);
		eSporet.pojacaj(4);
		
		System.out.println();
		eSporet.print();
		System.out.println("Potrosnja je: " + eSporet.potrosnja(5) + " kW.");
		
	}

}
