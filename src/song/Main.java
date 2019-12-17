package song;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ObjectWithColor objectWithColor = new ObjectWithColor();
        Quantity quantityForSong = new Quantity();
        quantityForSong.getA();
        boolean x = print();
        bottles (quantityForSong.getA(),objectWithColor);
    }

    private static boolean print() {
        boolean x = false;
        String start = "Запустить програму? (yes/no)";
        Scanner input  = new Scanner(System.in);
        System.out.println(start);
        String t = "yes";
        String str = input.next();
        if (str.equals(t)) {
            x = true;
        } else {
            System.out.println("Жаль, песня очень хорошая");
            x = false;
        }
        return x;
    }


    public static void bottles (int a, ObjectWithColor objectWithColor)  {

        String b = objectWithColor.getObjects();
        String c = objectWithColor.getObject();
        String d = objectWithColor.getColorObjects();
        String i = objectWithColor.getColorObject();
        //Вопрос о запуске
        String start = "Запустить програму? (yes/no)";
        boolean x = false;
        Scanner input  = new Scanner(System.in);
        System.out.println(start);
        String t = "yes";
        String str = input.next();
        if (str.equals(t)) {
            x = true;
        }
        else {
            System.out.println("Жаль, песня очень хорошая");
            return;
        }

        // Количество обьектов в песнеy
        String quantity = "Задайте количество от 1 до 90";
        int result = 1;
        boolean convert = false;
        while ( a > 90 | a < 1 | convert == false ) {
            System.out.println(quantity);
            String str2 = input.next();
            try {
                result = Integer.parseInt(str2);
                System.out.println("Вы ввели:" + result);
                convert = true;
            } catch (NumberFormatException igorResult) {
                System.out.println("Вы ввели не только цифры");
            }

            if (result < 0 | result > 91 & convert == true) {                         /// тут трабл
                System.out.println("Ваше значение вне диапазона от 1 до 90");
            }
            else a = result;
        }

        // запускается, если в консоли "y"
        while (a > 1  &  x == true) {
            System.out.println( a +  " " + d + " " + b + " пива на стене");
            System.out.println( a +  " " + d + " " + b +" пива!");
            System.out.println("Возьми одну, пусти по кругу");
            a = a -1;
        }
        if ( a == 1 &  x == true ) {
            b = "бутылка";
            System.out.println( a + " "  + i + " " + b + " пива на стене");
            System.out.println( a + " " + i + " " + b +" пива!");
            System.out.println("Возьми одну, пусти по кругу");
            a = a - 1;
        }
        if ( a == 0 &  x == true){
            System.out.println ("Нет бутылок пива на стене!");
        }
        // если напечатали что-угодно только не "yes"
    }
    }


