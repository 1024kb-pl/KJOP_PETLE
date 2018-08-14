package pl.maniaq;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] numbers = new int[3][3];

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.println("Podaj liczbę dla indeksów: ["+i+"]["+j+"]:");
                numbers[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Podane liczby przez użytkownika: ");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j] + " ");
            }
            //robienie nowej linii
            System.out.println();
        }


    }
}
