package d11_01_2022;

public class FacebookPost {

	String firstAndLastName;
	String firstAndLastNameFriend;
	String post;
	int likes;
	int shares;
	
	public void like() {
		this.likes += 1;
	}
	
	public void dislike() {
		this.likes -= 1;
		if (this.likes < 0) {
			this.likes = 0;
		}
	}
	
	public void share () {
		this.shares += 1;
	}
	
	public void print() {
		System.out.println(this.firstAndLastName + " >>> " + this.firstAndLastNameFriend);
		System.out.println(this.post);
		System.out.println("Likes " + this.likes + " | Shares " + this.shares);
	}
	
}
