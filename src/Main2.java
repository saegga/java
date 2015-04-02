/**
 * Created by sergei on 19.03.2015.
 */
public class Main2 {

    public static void main(String[] args) {
        double a = 2;
        double b = -6;
        double c = 0;
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        } else {
            double[] k = f(a, b, c, d);
            System.out.println("Решение : ");
            for (int i = 0; i < k.length; i++) {
                if (k[i] > 0) {
                    double x1 = Math.sqrt(k[i]);
                    double x2 = -Math.sqrt(k[i]);
                    System.out.println(x1 + " " + x2);
                } else if (k[i] == 0) {
                    System.out.println(k[i]);
                }
            }
        }
    }
    public static double[] f(double a, double b, double c, double d) {
        double[] res = new double[2];
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / 2 / a;
            double x2 = (-b - Math.sqrt(d)) / 2 / a;
            if (x1 < 0 && x2 < 0) {
                System.out.println("Корней нет");
            }
            res[0] = x1;
            res[1] = x2;
        }
        if (d == 0) {
            double x1 = -b / 2 / a;
            res[0] = x1;
        }
        return res;
    }
}
