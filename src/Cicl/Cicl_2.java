package Cicl;

public class Cicl_2 {
    public static void main(String[] args) {
        double a =0;
        double b = 10;
        double y;
        double h = 0.5;
        while(a<=b){
            if(a>2){
                y = a;
            } else{
                y = -a;
            }
            System.out.println("Значение в точке "+a+" равно " + y);
            a+=h;

        }

    }
}
