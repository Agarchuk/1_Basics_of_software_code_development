package Cicl;

public class Cicl_8 {
    public static void main(String[] args) {
        Integer a = 123450;
        Integer b = 5627803;
        String str_a = a.toString();
        String str_b = b.toString();
        int len_a = str_a.length();
        int len_b = str_b.length();
        //System.out.println(len_a);
        //System.out.println(len_b);
        for (int i = 0; i <= 9; i++) {
            int a1 = a;
            int b1 = b;
            //System.out.println("i "+i);
            int j = 0;
            while ( j <=len_a) {
                int c = a1 % 10;
                a1 /= 10;
                if (i == c) {
                    //System.out.println("c "+c);
                    int k =0;

                    while (k <=len_b) {
                        int d = b1 % 10;
                        //System.out.println("b "+b);
                        b1 /= 10;
                        if (i == d) {
                            //System.out.println("d "+d);
                            System.out.println("общее число " + i);
                            j++;
                            break;
                        }

                        k++;
                    }
                }
                j++;
            }
        }
    }

}

