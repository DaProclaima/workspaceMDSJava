package fr.mds.helloWolrdProject;

public class Character {

    String name;
    int height;
    boolean isAlive;

    void move() {
        if (!isAlive){
            System.out.println(name + " is dead and can not move");
            return; //when void just stops current execution
        } else {
            System.out.println(name + " is moving");

        }
    }

    void eat() {
        System.out.println(this.name + "  is eating");
    }
}
