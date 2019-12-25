package HomeWork;

public class Array {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 3, 5, 5, 8, 5};


        // public int[] getDuplicates(int [] ) {
        int index = 0;
       // int [] myArr = new int[index];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                   //myArr[index] = numbers[i];
                    index++;
                }
            } //expected result int[] myArr = {1, 5}
        }
        System.out.println(index);

    }

}


