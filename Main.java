import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        double r = 5;
        double k = 1.24 * Math.pow(10, -4);
        double t = 1 * Math.pow(10,-5);
        double z = 5 * Math.pow(10,3);
        double e = 2;


        double x2 = Math.pow(e,Math.pow(-r,t/k));
        double x1 = (1/r * (1 - x2));
        System.out.println("Результат: " + x2);

    }
}