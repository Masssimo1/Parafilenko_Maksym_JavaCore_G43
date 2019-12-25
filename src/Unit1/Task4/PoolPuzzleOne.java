package Unit1.Task4;

public class PoolPuzzleOne {

    public static void main(String[] args) {
        // x < 1
        // x > 0 --
        // x > 1
        // x > 3 --
        // x < 4

        // x = x + 1;
        // x = x + 2; --
        // x = x - 2;
        // x = x - 1; --

        // System.out.print("a "); --  /** В книге не верный ответ, так как стринга с пробелом!!!! */
        // System.out.print(" ");
        // System.out.print("n ");
        // System.out.print("an"); --

        // System.out.print("noise");  --
        // System.out.print("noys");
        // System.out.print("oise");
        // System.out.print(" oyster");
        // System.out.print("annoys"); --


        int x = 0;

        while ( x < 4 ) {
            if ( x  < 1 ){
                System.out.print("a ");
                System.out.print("noise");
                x = x -1;
            }
            if ( x > 0 ) {
                System.out.print("an");
            }
            if ( x == 1) {
                System.out.print("noys");
            }
            x = x + 2;
            if ( x > 3 ) {
                System.out.print(" oyster");
            }
            System.out.println("");
        }
    }
}
