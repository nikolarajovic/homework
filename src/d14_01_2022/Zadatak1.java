package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Autor autor = new Autor("Bojan", "Lekovic");
		Knjiga knjiga = new Knjiga("4919-2995", "Medvedi na putu", 2021, autor);
		
		knjiga.print();

	}

}
