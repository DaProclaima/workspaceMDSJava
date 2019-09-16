package fr.mds.helloWolrdProject;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("hello world");

        // Since Charater is in the same project, no include is needed
        Character myFirstChar = new Character();
        myFirstChar.name = "Bob";
        myFirstChar.height = 220;
        myFirstChar.isAlive = true;


        Character mySecondChar = new Character();
        mySecondChar.name = "Rob";
        mySecondChar.height = 150;
        mySecondChar.isAlive = false;


        System.out.println(myFirstChar.name);
        System.out.println(mySecondChar.name);

        myFirstChar.move();
        mySecondChar.move();

        // PRIMITIF
        int myOriginalInt = 10;
        System.out.println("Before execution =" + myOriginalInt);
        changeMyInt(myOriginalInt);
        System.out.println("After execution =" + myOriginalInt); // = 10. Copy

        int mySecondInt = 2;
        System.out.println("Before execution =" + mySecondInt);
        mySecondInt = doubleMyInt(mySecondInt);
        System.out.println("After execution =" + mySecondInt); // = 10. Copy

        //Object
        Character character = new Character();
        character.name = "Job";
        System.out.println("Before execution = " + character.name);
        changeMyName(character);// = 10. Copy
        System.out.println("After execution = " + character.name); // = 10. Copy
    }

    static void changeMyInt( int myInt) {
        myInt = 0;
    }

    static void changeMyName( Character character) {
        character.name = "Anatole";
    }

    static int doubleMyInt( int myInt) {
       return myInt * 2;
    }
}

