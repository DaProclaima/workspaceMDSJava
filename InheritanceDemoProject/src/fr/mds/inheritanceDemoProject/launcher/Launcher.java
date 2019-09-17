package fr.mds.inheritanceDemoProject.launcher;

import fr.mds.inheritanceDemoProject.model.Cat;
import fr.mds.inheritanceDemoProject.model.Catlike;
import fr.mds.inheritanceDemoProject.model.Tiger;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello World");
//		Catlike catlike = new Catlike();
//		catlike.setName("Bob");
		Catlike catlike = new Catlike("Bob");
		catlike.eat();
		
		Catlike catlike2 = new Catlike("Jule", "blue", 6);
		catlike2.eat();
		
		
		Tiger tiger = new Tiger();
		tiger.setName("Tigrou");
		tiger.setColor("Orange");
		tiger.setAge(10);
		tiger.eat();
		
		Cat cat = new Cat();
		cat.setName("Grosminet");
		cat.canBePet();
		
	}
}
