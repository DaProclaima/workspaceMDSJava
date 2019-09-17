package fr.mds.inheritanceDemoProject.model;

import java.lang.reflect.Constructor;

// JavaBean style class. In documentation when they tell us to create this you know right away what it takes
public class Catlike {
	protected String name;
	protected String color;
	protected int age;
	
	
	/**
	 * {@link Constructor}
	 * is used to set a default value as long as we don t give parameters
	 */
	public Catlike() {
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * 
	 * @param name
	 * overloaded constructor method
	 */
	public Catlike(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("Catlike hunting for food");
	}
	
	
	
	public Catlike(String name, String color, int age) {
// what is it?		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void eat() {
		System.out.println("My catlike "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
