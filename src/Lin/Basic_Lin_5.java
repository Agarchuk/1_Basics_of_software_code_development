package Lin;

public class Basic_Lin_5 {
    public static void main(String[] args) {
        int T =36061;
        int seconds = T%60;
        int minutes = ((T-seconds)%3600)/60;
        int hours = T/3600;
        System.out.println(hours+"ч " + minutes+"мин "+ seconds+ "с");
            }
}
