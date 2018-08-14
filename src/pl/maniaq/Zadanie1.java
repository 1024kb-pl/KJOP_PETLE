package pl.maniaq;

public class Zadanie1 {

    public static void main(String[] args) {
        int [] numbers = {12, 532, 43, 231, 6, 534, 329, 23};

        int sum = 0;
        for (int number : numbers
                ) {
            sum += number;
            // to samo co:
            // sum = sum + number;
        }

        System.out.println("Suma wszystkich liczb to: "+sum);
    }
}
