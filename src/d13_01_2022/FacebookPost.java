package d13_01_2022;

public class FacebookPost {
	
	private String korisnik;
	private String konekcija;
	private String post;
	private int likes;
	private int shares;
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String korisnik, String konekcija, String post, int likes, int shares) {
		this.korisnik = korisnik;
		this.konekcija = konekcija;
		this.post = post;
		this.likes = likes;
		this.shares = shares;
	}
	
	public String getKorisnik() {
		return this.korisnik;
	}
	
	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}
	
	public String getKonekcija() {
		return this.konekcija;
	}
	
	public void setKonekcija(String konekcija) {
		this.konekcija = konekcija;
	}
	
	public String getPost() {
		return this.post;
	}
	
	public void setPost(String post) {
		this.post = post;
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	
	public int getShares() {
		return this.shares;
	}
	
	public void like() {
		this.likes++;
	}
	
	public void dislike() {
		this.likes--;
	}
	
	public void share() {
		this.shares++;
	}
	
	public void print() {
		System.out.println(this.korisnik + " >>> " + this.konekcija);
		System.out.println(this.post);
		System.out.println("Likes " + this.likes + " | Shares " + this.shares);
	}
	
}
