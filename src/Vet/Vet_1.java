package Vet;

public class Vet_1 {
    public static void main(String[] args) {
        int angle_1 = 60;
        int angle_2 = 30;
        if ((angle_1 + angle_2) < 180) {
            int angle_3 = 180 - (angle_1 + angle_2);
            if (angle_3 == 90) {
                System.out.println("Прямоугольный треугольник");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Такого прямоугольника не существует");
        }
    }
}
