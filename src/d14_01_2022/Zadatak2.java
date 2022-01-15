package d14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Proizvod banana = new Proizvod("3", "Banana", 120);
		Proizvod jabuka = new Proizvod("14", "Jabuka", 105);
		Vaga vaga = new Vaga();
		
		vaga.setProizvod(banana);
		vaga.setMernaJedinica("kg");
		vaga.sracunajCenu(5);
		vaga.print(5);
		
		System.out.println();
		
		vaga.setProizvod(jabuka);
		vaga.setMernaJedinica("lb");
		vaga.sracunajCenu(10);
		vaga.print(10);
		
	}

}
