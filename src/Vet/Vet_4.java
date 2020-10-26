package Vet;

public class Vet_4 {
    public static void main(String[] args) {
        int x = 3, y = 5, z = 1;
        int A = 1, B = 2;
        int min1, min2;
        // находим первую наименьшие стороны
        if (x < y & x < z) {
            min1 = x;
        } else if (y < x & y < z) {
            min1 = y;
        } else {
            min1 = z;
        }
        // находим вторую наименьшую сторону
        if (x < y & x > z | x > y & x < z) {
            min2 = x;
        } else if (y < x & y > z | y > x & y < z) {
            min2 = y;
        } else {
            min2 = z;
        }
        System.out.println(min1);
        System.out.println(min2);
        //проверка пройдет ли кирпич
        if (min1 <= A & min2 <= B | min2 <= A & min1 <= B) {
            System.out.println("пройдет");
        } else {
            System.out.println("не пройдет");
        }
    }
}
