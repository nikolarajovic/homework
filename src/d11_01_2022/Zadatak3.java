package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost fb1 = new FacebookPost();
		FacebookPost fb2 = new FacebookPost();
		
		fb1.firstAndLastName = "John Nickovic";
		fb1.firstAndLastNameFriend = "Ann Lines";
		fb1.post = "You are AWESOME!";
		fb1.likes = 355;
		fb1.shares = 10;
		
		fb2.firstAndLastName = "Novak Djokovic";
		fb2.firstAndLastNameFriend = "Rafael Nadal";
		fb2.post = "I am back.";
		fb2.likes = 14333;
		fb2.shares = 1230;
		
		fb1.like();
		fb1.share();
		fb1.share();
		fb1.print();
		
		System.out.println();
		
		fb2.like();
		fb2.print();
		
	}

}
