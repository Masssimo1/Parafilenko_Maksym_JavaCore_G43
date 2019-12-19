package song;

import java.util.Scanner;

/**
 * final/static - нужно посмотреть !!!!
 */
public class Main {
    public static void main(String[] args) {
        int a = 0; // при изменению нужно править метод questionQuantity
        boolean restart = true;
        boolean start = print();
        ObjectWithColor objectWithColor = new ObjectWithColor();
        Quantity quantityForSong = new Quantity();

        // тело
        while (start || restart) {
            if (start) {
                boolean checkQuantity = print2();
                if (checkQuantity) {
                    int quantity = questionQuantity(a);
                    bottles(quantity, objectWithColor);
                } else bottles(quantityForSong.getA(), objectWithColor);
            }
            start = restart();
            restart = start;
        }
        System.out.println("Конец");
    }

    //Вопрос о запуске
    private static boolean print() {
        boolean firstAnswer = false;
        String start = "Вопрос#1: Запустить програму? (yes/no)";
        Scanner input = new Scanner(System.in);
        System.out.println(start);
        String yes = "yes";
        String str = input.next();
        if (str.equals(yes)) {
            firstAnswer = true;
        }
            System.out.println("Жаль, песня очень хорошая");
        return firstAnswer;
    }

    // количество задавать или нет
    private static boolean print2() {
        boolean secondAnswer = false;
        String start2 = "Вопросу#2: Наберите 'yes', если хотете задать свое значение.";
        System.out.println(start2);
        Scanner input3 = new Scanner(System.in);
        String str3 = input3.next();
        String yes = "yes";
        if (str3.equals(yes)) {
            secondAnswer = true;
        }
            System.out.println("Будет использовано дефолтное значени и Вопрос#3 будет пропущен");

        return secondAnswer;
    }

    // Количество обьектов в песне

    private static int questionQuantity(int a) {
        int result;
        Scanner input3 = new Scanner(System.in);
        String quantity = "Задайте количество от 1 до 99";
        boolean convert = false;
        while (a > 99 || a < 1 || !convert) {
            System.out.println(quantity);
            String str2 = input3.next();
            try {
                result = Integer.parseInt(str2);
                System.out.println("Вы ввели:" + result);
                convert = true;
            } catch (NumberFormatException igorResult) {
                System.out.println("Вы ввели не только цифры");
                result = 0;
            }

            if (result < 0 || result > 99 & !convert) {                         /// тут трабл
                System.out.println("Ваше значение вне диапазона от 1 до 90");
            } else a = result;
        }
        return a;
    }

    private static void bottles(int a, ObjectWithColor objectWithColor) {

        String b = objectWithColor.getObjects();
        String c = objectWithColor.getObject();
        String d = objectWithColor.getColorObjects();
        String i = objectWithColor.getColorObject();


        // запускается, если в консоли "y"
        while (a > 1) {
            System.out.println(a + " " + d + " " + b + " пива на стене");
            System.out.println(a + " " + d + " " + b + " пива!");
            System.out.println("Возьми одну, пусти по кругу");
            a = a - 1;
        }
        if (a == 1) {
            System.out.println(a + " " + i + " " + c + " пива на стене");
            System.out.println(a + " " + i + " " + c + " пива!");
            System.out.println("Возьми одну, пусти по кругу");
            a = a - 1;
        }
        if (a == 0) {
            System.out.println("Нет бутылок пива на стене!");
        }

    }

    private static boolean restart() {
        boolean restartQuestion = false;
        String start = "Запустить програму еще раз? (yes/no)";
        Scanner input = new Scanner(System.in);
        System.out.println(start);
        String yes = "yes";
        String str4 = input.next();
        if (str4.equals(yes)) {
            restartQuestion = true;
            System.out.println("Ок. переходим в Вопросу#2");
        } else {
            restartQuestion = false;
        }
        return restartQuestion;

    }
}


