package Cicl;

public class Cicl_5 {
    public static void main(String[] args) {
        double e =0.1;
        double a;
        int k = 1;
        int n = 10;
        double result= 0;
        while(k<=n){
            a = 1/Math.pow(2, k) + 1/Math.pow(3,k);
            if(Math.abs(a)>=e){
                result += a;
            }
            k++;
        }
        System.out.println(result);
    }
}
