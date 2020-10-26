package Vet;

public class Vet_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 5;
        int d = 3;
        int min1;
        int min2;
        int max;
        if(a>b){
            min1 = b;
        }
        else{
            min1 = a;
        }
        if(c>d){
            min2 = d;
        }
        else{
            min2 = c;
        }
        if(min1<min2){
            max = min2;
        }
        else{
            max = min1;
        }
        System.out.println(max);
    }
}
