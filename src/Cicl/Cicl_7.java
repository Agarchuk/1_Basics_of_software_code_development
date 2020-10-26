package Cicl;

import java.util.Scanner;

public class Cicl_7 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        do {
            Scanner scan1 = new Scanner("a");
            boolean isNumber = false;
            while (!isNumber) {
                System.out.print("Введите начальное число m: ");
                scan1 = new Scanner(System.in);
                if (scan1.hasNextInt()) {
                    m = scan1.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("Вы ввели не число\nПопробуйте ещё раз!");
                }
            }

            Scanner scan2 = new Scanner("a");
            isNumber = false;
            while (!isNumber) {
                System.out.print("Введите конечное число n: ");
                scan2 = new Scanner(System.in);
                if (scan2.hasNextInt()) {
                    n = scan2.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("Вы ввели не число\nПопробуйте ещё раз!");
                }
            }
            if (m >= n) {
                System.out.println("Вы ввели число m>=n. Попробуйте еще раз.");
            }
        } while (m >= n);
        for (; m <= n; m++) {
            System.out.println("Делители для числа " +m+ ":");
            for (int i = 2; i <= 9; i++) {
                if (m % i == 0 & i != m) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
