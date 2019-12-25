package Unit1.Task3;

public class Message {
    public static void main(String[] args) {
        block1();
        /**
         * Задание:
         "y = x - y"
         * будет - "00 11 21 32 42"
         * ответил правильно */
        block2();
        /**
         * Задание "y = y + x" будет "00 11 23 36 410"*/ // Ответил правильно
        block3();
        /**
         * Задание:
         y = y + 2;
         if ( y > 4 ) {
         y = y -1;
         }
         * будет  - "02 14 25 36 47"*/ // Ответил правильно
        block4();
        /**
         * Задание:
         x = x + 1;
         y = y + x;
         * Будет - " 11 34 59"*/ // Ответил правильно

        block5();
        /**
         * Задание
         if ( y < 5 ) {
            x = x + 1;
            if ( y < 3 ) {
            x = x - 1;
            }
         }
         y = y + 2;
         * Ответ - "22 46" */ // !!!Ответил Не правлиьно!!!!
    }

    private static void block5() {
        int x = 0;
        int y = 0;
        while ( x < 5 ){
            if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print( x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }

    private static void block4() {
        int x = 0;
        int y = 0;
        while ( x < 5 ){
            x = x + 1;              //
            y = y + x;              //
            System.out.print( x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }

    private static void block3() {
        int x = 0;
        int y = 0;
        while ( x < 5 ){
            y = y + 2;           //
            if ( y > 4 ) {       //
                y = y -1;        //
            }                    //
            System.out.print( x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");

    }

    private static void block2() {
        int x = 0;
        int y = 0;
        while ( x < 5 ){
            y = y + x;           //
            System.out.print( x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }

    private static void block1() {
        int x = 0;
        int y = 0;
        while ( x < 5 ){
            y = x - y;          //
            System.out.print( x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }
}
