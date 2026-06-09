package main;

public class Libro extends Libreria {

	private String nomeLibro;
	private String autoreLibro;
	private String genereLibro;
	private String codiceIsbn;
	private double costoLibro;
	
	Libro (String nomeLibro, String autoreLibro, String genereLibro, String codiceIsbn, double costoLibro){
		
		this.nomeLibro = nomeLibro;
		this.autoreLibro = autoreLibro;
		this.genereLibro = genereLibro;
		this.codiceIsbn = codiceIsbn;
		this.costoLibro = costoLibro;
	}
	
	public String getName() {
		return nomeLibro;
	}
	
	public void setName(String nomeLibro) {
		this.nomeLibro = nomeLibro;
	}
	
	public String getAuthor() {
		return autoreLibro;
	}
	
	public void setAuthor(String autoreLibro) {
		this.autoreLibro = autoreLibro;
	}
	
	public String getGenre() {
		return genereLibro;
	}
	
	public void setGenre(String genereLibro) {
		this.genereLibro = genereLibro;
	}
	
	public String getIsbn() {
		return codiceIsbn;
	}
	
	public void setIsbn(String codiceIsbn) {
		this.codiceIsbn = codiceIsbn;
	}
	
	public double getPrice() {
		return costoLibro;
	}
	
	public void setPrice(double costoLibro) {
		this.costoLibro = costoLibro;
	}

	public void stampaLibro() {
		System.out.println("Titolo: " + getName());
		System.out.println("Autore: " + getAuthor());
		System.out.println("Genere: " + getGenre());
		System.out.println("ISBN: 978-" + getIsbn());
		System.out.println("Costo: " + getPrice() + " Euro");
		System.out.println("---------------");
	}

}

