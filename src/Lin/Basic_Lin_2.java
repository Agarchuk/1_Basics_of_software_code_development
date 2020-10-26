package Lin;

public class Basic_Lin_2 {
    public static void main(String[] args) {
        double a = 4.4;
        double b = 3.3;
        double c = 1.1;
        double y = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(y);
    }
}
