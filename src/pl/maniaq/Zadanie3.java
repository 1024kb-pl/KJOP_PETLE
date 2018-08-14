package pl.maniaq;

public class Zadanie3 {

    public static void main(String[] args) {
        int [] numbers = {12, 2, 15, 9, 11, 8, 15};

        // gdybysmy dali 0 to każda liczba pomnożona przez 0 dałaby 0 - więc musi byc 1
        int multiply = 1;
        for (int number : numbers
                ) {
            multiply *= number;
            // to samo co:
            // multiply = multiply * number;
        }

        System.out.println("Wynik mnożenia wszystkich liczb to: "+multiply);
    }
}
