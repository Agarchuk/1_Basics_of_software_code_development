package Cicl;

public class Cicl_4 {
    public static void main(String[] args) {
        int n = 200;
        int result = 1;
        int k = 1;
        while (k<=n){
            result *= Math.pow(k, 2);
            k++;

        }
        System.out.println(result);
    }
}
