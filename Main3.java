import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;


        System.out.println("Введіть число х: ");
        double x = scanner.nextInt();
        System.out.println("Введіть число у: ");
        double y = scanner.nextInt();


        if (x < 0 && y <= 4) {
            System.out.println("Результат: " + (a*x+Math.pow(x,2)));
        }else if (x == 4) {
            System.out.println("Результат: " + Math.cbrt(b*x-1+3));
        }else if (x <= 4 && y == 10) {
            System.out.println("Результат: " + Math.cos(x));
        }else {
            System.out.println("Не вірні дані");
        }



    }
}
