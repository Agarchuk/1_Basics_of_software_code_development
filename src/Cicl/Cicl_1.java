package Cicl;

import java.util.Scanner;

public class Cicl_1 {
    public static void main(String[] args) {
        int number = 0;
        int result = 0;
        int k = 1;
        while (number <= 0) {
            System.out.print("Введите число: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                number = scan.nextInt();
            } else {
                System.out.println("Вы ввели не число\nПопробуйте ещё раз!");
            }

            //перевод строки в число


        }
        while (k <= number) {
            result += k;
            k++;
        }
        System.out.println(result);
    }
}