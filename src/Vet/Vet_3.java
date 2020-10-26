package Vet;

public class Vet_3 {
    public static void main(String[] args) {
        //y = kx+b
        int x1 = 1, x2 = 2, x3 = 2, y1 = 1, y2 = 2, y3 = 3;
        //находим параметр k
        double k = (y1-y2)/(x1-x2);
        //находим параметр b;
        double b = y1 - k*x1;
        if ((k*x3+b)==y3){
            System.out.println("Точки расположены на одной прямой");
        }
        else {
            System.out.println("Точки на разных прямых");
        }
    }
}
