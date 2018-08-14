package pl.maniaq;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" 1 - Dodaj ");
            System.out.println(" 2 - Odejmij ");
            System.out.println(" 3 - Pomnóż ");
            System.out.println(" 4 - Podziel ");
            System.out.println(" 5 - Reszta z dzielenia ");

            int radix = scanner.nextInt();

            System.out.println("Podaj pierwsza liczbę: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Podaj drugą liczbę: ");
            int secondNumber = scanner.nextInt();

            switch (radix) {
                case 1:
                    System.out.println("Wynik dodawania: " + (firstNumber+secondNumber));
                    break;
                case 2:
                    System.out.println("Wynik odejmowania: " + (firstNumber-secondNumber));
                    break;
                case 3:
                    System.out.println("Wynik mnożenia: " + (firstNumber*secondNumber));
                    break;
                case 4:
                    System.out.println("Wynik dzielenia: " + (firstNumber/secondNumber));
                    break;
                case 5:
                    System.out.println("Reszta z dzielenia: " + (firstNumber%secondNumber));
                    break;
                default:
                    System.out.println("Nie wybrano poprawnej opcji.");
                    break;
            }
        }
    }
}
