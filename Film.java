package main;

public class Film extends Libreria{

    private String nomeFilm;
    private String registaFilm;
    private String protagonistaFilm;
	private String genereFilm;
	private double costoFilm;
	
	Film (String nomeFilm, String autoreFilm, String genereFilm, String protagonistaFilm, double costoFilm) {
		
		this.nomeFilm = nomeFilm;
		this.registaFilm = autoreFilm;
		this.genereFilm = genereFilm;
        this.protagonistaFilm = protagonistaFilm;
		this.costoFilm = costoFilm;
	}
	
	public String getName() {
		return nomeFilm;
	}
	
	public void setName(String nomeFilm) {
		this.nomeFilm = nomeFilm;
	}
	
	public String getDirector() {
		return registaFilm;
	}
	
	public void setDirector(String registaFilm) {
		this.registaFilm = registaFilm;
	}
	
	public String getProtagonist() {
		return protagonistaFilm;
	}
	
	public void setProtagonist(String protagonistaFilm) {
		this.protagonistaFilm = protagonistaFilm;
	}
	
	public String getGenre() {
		return genereFilm;
	}
	
	public void setGenre(String genereFilm) {
		this.genereFilm= genereFilm;
	}
	
	public double getPrice() {
		return costoFilm;
	}
	
	public void setPrice(double costoFilm) {
		this.costoFilm = costoFilm;
	}

	public void stampaFilm() {
		System.out.println("Titolo: " + getName());
		System.out.println("Regista: " + getDirector());
		System.out.println("Genere: " + getGenre());
		System.out.println("Costo: " + getPrice() + " Euro");
		System.out.println("---------------");
	}
}
