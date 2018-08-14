package pl.maniaq;

public class Zadanie2 {

    public static void main(String[] args) {
        int [] numbers = {12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40};

        int countEven = 0;
        for(int number : numbers) {
            boolean isEven = number % 2 == 0;
            if (isEven) {
                countEven++;
                // to samo co:
                // countEvent = countEvent + 1;
            }
        }
        System.out.println("Zbiór ma " + countEven + " liczb parzystych.");
    }

}
