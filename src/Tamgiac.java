import java.lang.Math;

public class Tamgiac {
    private double a, b, c;

    public Tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean is_valid_triangle() {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public double chu_vi() {
        return a + b + c;
    }

    public double dien_tich() {
        double s = chu_vi() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
