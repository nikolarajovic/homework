package d14_01_2022;

public class Knjiga {

	private String isbn;
	private String naziv;
	private int godina;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int godina, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;
		this.autor = autor;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
		
	public String getNaziv(String naziv) {
		return this.naziv;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Autor getAutor() {
		return this.autor;
	}
	
	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godina);
		System.out.print("Autor: ");
		this.autor.print();
	}
	
}
