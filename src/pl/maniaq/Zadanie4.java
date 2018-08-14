package pl.maniaq;

public class Zadanie4 {
    public static void main(String[] args) {
        int [] numbers = {32, 21, 0, 1, 23, 12, 42, 55, 13, 5};

        //Bierzemy najwieksza mozliwosc wartość jaką można zapisać na int
        int min = Integer.MAX_VALUE;
        //petla foreach
        for(int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Najmniejsza wartość to: " + min);

        //Bierzemy najmniejszą mozliwosc wartość jaką można zapisać na int
        int max = Integer.MIN_VALUE;
        //tym razem pętla for
        for(int i=0;i<numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Największa wartość to: " + max);

    }
}
