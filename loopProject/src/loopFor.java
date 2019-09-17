public class loopFor {



        public static void main(String[] args) {

        System.out.println("Welcome");

        System.out.println("Line :");
        line(10);
        System.out.print("\n");
        System.out.println("Square :");
        square(10);
        System.out.println("Empty square :");
        emptySquare(10);
        System.out.println("Triangle :");
        triangle(10);
    }

    static void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }


    static void square( int n){
        for (int i = 0; i < n; i++) {
            line(n);
            System.out.print("\n");
        }
    }

    static void emptySquare(int n) {
        line(n);
        System.out.print("\n");
        for(int i = 0 ; i < n-2; i++){
            System.out.println("*                 *");
        }
        // System.out.print("\n");
        line(n);
    }

    static void triangle(int n) {
        for(int i = 0; i < n; i++){

            line(i);
            System.out.print("\n");

        }
    }
}
