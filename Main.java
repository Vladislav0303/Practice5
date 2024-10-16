import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        double r = 5;
        double k = 1.24 * Math.pow(10, -4);
        double t = 1 * Math.pow(10,-5);
        double z = 5 * Math.pow(10,3);
        double e = 2;

        double x = 1/r * (1-e);
        double x1 = t/k;
        double x2 = x * e * Math.pow(-k,x1);
        System.out.println("Результат: " + x2);

    }
}