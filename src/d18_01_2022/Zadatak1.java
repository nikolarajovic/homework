package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Student student = new Student(44223, "Mario Danilovic", "Master");
		
		student.dodajIspit("Medjunarodna ekonomija", 9, "Dragan Markovic");
		student.dodajIspit("Osnove ekonomije", 8, "Zoran Radic");
		student.dodajIspit("Upravljanje perfomansama preduzeca", 10, "Zorica Danic");
		student.dodajIspit("Medjunarodno pravo", 6, "Danica Maric");
		
		student.print();

	}

}
