package SongFromPage44;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/** Страница 44
 * Детская песенка , про 99 бутылою
 *
 * Реализация дополненна:
 * 1- ДОбавлены вопросы
 * 2- Для ответов используються импуты и распознавание чисел и текста
 * 3- Код сраынивает введеныне ответы, как числа так и стринги
 * 4- Реализован посторный старт просграммы
 * 5- используються Scanner,equals,input.next, final, static,TimeUnit.sleep
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int a = 0;
        boolean restart = true;
        boolean start = print();
        ObjectWithColor objectWithColor = new ObjectWithColor();


        // тело
        while (start || restart) {
            if (start) {
                boolean checkQuantity = print2();
                if (checkQuantity) {
                    int quantity = questionQuantity(a);
                    bottles(quantity, objectWithColor);
                } else bottles(Quantity.DEFAULT_MAX_VALUE, objectWithColor);
            }
            start = restart();
            restart = start;
        }
        System.out.println("Спасибо за то, что воспользовались нашим сервисом :)");
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
        } else System.out.println("Жаль, песня очень хорошая. Может передумаете....:)");
        return firstAnswer;
    }

    // Вопрос: использовать дефолтное значение или задать свое
    private static boolean print2() {
        boolean secondAnswer = false;
        String start2 = "Вопросу#2: Наберите 'yes', если хотете задать свое значение.";
        System.out.println(start2);
        Scanner input3 = new Scanner(System.in);
        String str3 = input3.next();
        String yes = "yes";
        if (str3.equals(yes)) {
            secondAnswer = true;
        } else System.out.println("Будет использовано дефолтное значени и Вопрос#3 будет пропущен");
        return secondAnswer;
    }

    // Задать своге значение для песни в диапазоне от 1 до 99

    private static int questionQuantity (int a) {
        int result;
        int defaultMaxQuantity = Quantity.DEFAULT_MAX_VALUE;
        int defaultMinQuantity = Quantity.DEFAULT_MIN_VALUE;
        Scanner input3 = new Scanner(System.in);
        String quantity = "Задайте количество от 1 до 99";
        while (a > defaultMaxQuantity || a < defaultMinQuantity ) {
            System.out.println(quantity);
            String str2 = input3.next();
            try {
                result = Integer.parseInt(str2);
                System.out.println("Вы ввели:" + result);
            } catch (NumberFormatException igorResult) {
                System.out.println("Вы ввели не только цифры");
                result = 0;
            }

            if (result < defaultMinQuantity || result > defaultMaxQuantity ) {                         /// тут трабл
                System.out.println("Ваше значение вне диапазона от 1 до 99");
            } else return result;
        }
        return a;
    }

    // Запуск песни
    private static void bottles(int a, ObjectWithColor objectWithColor) throws InterruptedException {

        String b = objectWithColor.getObjects();
        String c = objectWithColor.getObject();
        String d = objectWithColor.getColorObjects();
        String i = objectWithColor.getColorObject();
        System.out.println( "Песня начнеться через 3 секунды");
        TimeUnit.SECONDS.sleep(3);
        while (a > 1) {
            System.out.println(a + " " + d + " " + b + " пива на стене");
            System.out.println(a + " " + d + " " + b + " пива!");
            System.out.println("Возьми одну, пусти по кругу");
            TimeUnit.MILLISECONDS.sleep (300);
            a = a - 1;
        }
        if (a == 1) {
            System.out.println(a + " " + i + " " + c + " пива на стене");
            System.out.println(a + " " + i + " " + c + " пива!");
            System.out.println("Возьми одну, пусти по кругу");
            TimeUnit.MILLISECONDS.sleep (300);
            a = a - 1;
        }
        if (a == 0) {
            System.out.println("Нет бутылок пива на стене!");
        }

    }

    //restart check
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
        }
        return restartQuestion;
        }
}



