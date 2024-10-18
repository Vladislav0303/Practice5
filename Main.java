import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double r = 5;
        double k = 1.24 * Math.pow(10, -4);
        double t = 1 * Math.pow(10,-5);
        double z = 5 * Math.pow(10,3);
        double e = 2;


        double x2 = Math.pow(e,-r*t/k);
        double x1 = (1/r * (1 - x2));
        System.out.println("Результат: " + x1);


        double y = Math.pow(z,2) * Math.asin(r/Math.sqrt(100 - Math.pow(r,2)));
        System.out.println("Результат: " + y);

    }
}