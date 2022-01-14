package d13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		FacebookPost fb1 = new FacebookPost("Nick Rayovski", "Charles Buckovski", "Women, right?", 0, 0);
		
		fb1.like();
		fb1.like();
		fb1.like();
		fb1.dislike();
		fb1.like();
		
		for (int i = 0; i < 10; i++) {
			fb1.share();
		}
		
		fb1.print();
		
		System.out.println();
		
		FacebookPost fb2 = new FacebookPost();
		
		fb2.setKorisnik("Ratomir Nedeljnic");
		fb2.setKonekcija("Tomislav Radojevic");
		fb2.setPost("Pecanje je u 6 ujutru.");
		
		fb2.like();
		fb2.share();
		fb2.print();
		
	}

}
