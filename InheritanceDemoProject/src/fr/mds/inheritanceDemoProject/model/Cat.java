package fr.mds.inheritanceDemoProject.model;

public class Cat extends Catlike {

	public void canBePet() {
		System.out.println(super.name + " allows you to be pet whitout eating you up");
	}
	
	
	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Cat hunting for fun");
	}
}