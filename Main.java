package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       	Scanner scanner = new Scanner(System.in);
		ArrayList <Libro> biblioteca = new ArrayList<>();
		ArrayList <Film> sezioneCinema = new ArrayList<>();

		int decisione;
		int continua;

		System.out.println("------------------------------------");
		System.out.println("Dispensa Culturale di Rovereto\nBenvenuto, cosa desidera visionare?");
		System.out.println("\t1.Libreria\n\t2.Sezione Cinema");
		System.out.println("------------------------------------");

		do {
			decisione = scanner.nextInt();
			if (decisione < 1 || decisione > 2) {
					System.out.println("Digitare 1 o 2.");
			}
		} while (decisione < 1 || decisione > 2);

		if (decisione == 2) {
			System.out.println("-----------------------------------------------");
			System.out.println("\tSezione Cinema di Rovereto\nBenvenuto, selezionare una delle seguenti voci");
			do{
			System.out.println("\t1. Tutti i film presenti\n\t2. Aggiungi un film\n\t3. Rimuovi un film");
			System.out.println("-----------------------------------------------");
			
			do {
				decisione = scanner.nextInt();
				if (decisione < 1 || decisione > 3) {
					System.out.println("Digitate un valore compreso tra 1 e 3");
				}
			} while (decisione < 1 || decisione > 3);

			if (decisione == 1) {
				if (sezioneCinema.isEmpty()) {
					System.out.println("Non ci sono film presenti.");
				}else {
					System.out.println("Film presenti:\n---------------");
					for (Film film : sezioneCinema) {
						film.stampaFilm();
					}
				}
			}

			do{
			System.out.println("Vuoi continuare? (1 per sì, 0 per no)");
			continua = scanner.nextInt();
			scanner.nextLine();
			if (continua == 0) {
				break;
			}
			}while (continua != 0 && continua != 1);
			}while (continua == 1);
		}

		if (decisione == 1) {
			System.out.println("-----------------------------------------------");
			System.out.println("\tLibreria di Rovereto\nBenvenuto, selezionare una delle seguenti voci");
			do{
			System.out.println("\t1. Tutti i libri presenti\n\t2. Aggiungi un libro\n\t3. Rimuovi un libro");
			System.out.println("-----------------------------------------------");
			
			do {
				decisione = scanner.nextInt();
				if (decisione < 1 || decisione > 3) {
					System.out.println("Digitare un numero compreso tra 1 e 3.");
			}
			scanner.nextLine();
			}while (decisione < 1 || decisione > 3);
			
			
			if (decisione == 3) {
				System.out.print("Inserire il titolo del libro da rimuovere: ");
				String titoloRimosso = scanner.nextLine();
				boolean trovato = false;
				for (int i = 0; i < biblioteca.size(); i++) {
					if (titoloRimosso.equals(biblioteca.get(i).getName())) {
						biblioteca.get(i).eliminaLibro();
						biblioteca.remove(i);
						trovato = true;
						break;
					}
				}
				if (!trovato) {
					System.out.println("Il libro non è presente nella lista.");
				}
			}

			if (decisione == 1) {
				if (biblioteca.isEmpty()) {
					System.out.println("Non ci sono libri presenti.");
				} else {
					System.out.println("Libri presenti:");
					System.out.println("---------------");
					for (Libro libro : biblioteca) {
						libro.stampaLibro();
					}
				}
			}

			try{
			if (decisione == 2) {
				Libro nuovoLibro = new Libro("", "", "", "", 0.0);
				System.out.print("Inserire il titolo: ");
				nuovoLibro.setName(scanner.nextLine());
				System.out.print("Inserire l'autore: ");
				nuovoLibro.setAuthor(scanner.nextLine());
				System.out.print("Inserire il genere: ");
				nuovoLibro.setGenre(scanner.nextLine());
				do{
				System.out.print("Inserire il codice ISBN: 978");
				nuovoLibro.setIsbn(scanner.nextLine());
				if(nuovoLibro.getIsbn().length() != 10) {
					System.out.println("Il codice ISBN deve essere composto da 13 cifre.");
					}
				}while (nuovoLibro.getIsbn().length() != 10);
				System.out.print("Inserire il costo: ");
				nuovoLibro.setPrice(scanner.nextDouble());
				biblioteca.add(nuovoLibro);
				nuovoLibro.libroAggiunto();
			}
			}catch (Exception InputMismatchException) {
				System.out.print("Errore nella digitazione ");
				scanner.nextLine();
			}
			do{
			System.out.println("Vuoi continuare? (1 per sì, 0 per no)");
			continua = scanner.nextInt();
			scanner.nextLine();
			if (continua == 0) {
				break;
			}
			}while (continua != 0 && continua != 1);
			}while (continua == 1);
		}

		scanner.close();
		
    }
}
