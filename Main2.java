import java.lang.Math;

public class Main2 {
    public static void main(String[] args) {
        double r = 5;
        double k = 1.24 * Math.pow(10, -4);
        double t = 1 * Math.pow(10,-5);
        double z = 5 * Math.pow(10,3);
        double e = 2;

        double y = Math.pow(z,2);
        double y1 = Math.asin(r/Math.cbrt(100 - Math.pow(r,2)));
        double y2 = y * y1;
        System.out.println("Результат: " + y2);

    }
}