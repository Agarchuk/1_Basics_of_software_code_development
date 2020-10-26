package Cicl;

public class Cicl_3 {
    public static void main(String[] args) {
        int k =1;
        int n =100;
        int result =0;
        while(k <= n){
            result += Math.pow(k, 2);
            k++;
        }
        System.out.println(result);
    }

}
