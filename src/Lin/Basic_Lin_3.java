package Lin;

public class Basic_Lin_3 {
    public static void main(String[] args) {
        double x=3.14;
        double y=6.28;
        double z;
        z = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println(z);
    }
}
