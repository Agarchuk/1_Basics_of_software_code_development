package Lin;

public class Basic_Lin_4 {
    public static void main(String[] args) {
        float R = 111.222f;
        //целая часть
        int c = (int) R;
        System.out.println(c);
        //десятичная часть
        float d = R - c;
        System.out.println(d);
        //десятичную часть делаем целой
        int c1 = (int) (d * 1000.0);
        System.out.println(c1);
        //целую часть делаем десятичной
        float d1 = c / 1000.0f;
        System.out.println(d1);
        //итоговое число
        float result = d1 + c1;

        System.out.println(result);
    }
}
