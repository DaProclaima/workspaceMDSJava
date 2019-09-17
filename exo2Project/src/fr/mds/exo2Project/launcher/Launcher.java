package fr.mds.exo2Project.launcher;

import fr.mds.exo2Project.author.Author;
import fr.mds.exo2Project.book.Book;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello. create new author");
//		Author author1 = new Author("Sébastien NOBOUR", "sebastien.nobour@gmail.com", 'm');
//		System.out.println(author1.getEmail());
//		System.out.println(author1.getGender());
//		System.out.println(author1.getName());
//		System.out.println(author1.toString());
//		System.out.println(author1.toString().equals(String.class));

		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com",'m');
		
		Book aBook = new Book(anAuthor, "myBook", 12, 60);
		
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getName());
		System.out.println(aBook.getPrice());
		System.out.println(aBook.getQtyInStock());
		aBook.setPrice(15);
		aBook.setQtyInStock(12);
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getGender());
		System.out.println(aBook.getAuthor().getEmail());
		System.out.println(aBook.getName());
		System.out.println(aBook.getPrice());
		System.out.println(aBook.getQtyInStock());
	}
	
	

}
