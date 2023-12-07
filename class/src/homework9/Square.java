package homework9;
import static java.lang.Math.sqrt;

public class Square {
    int a;

    public Square(int a) {
        this.a = a;
    }

    public int getPerimeter(int a) {
        return 4 * a;
    }

    public int getArea(int a) {
        return a * a;
    }

    public double getDiagonal(int a) {
        return a * sqrt(2);
    }

    public String toString() {
        return "Периметр квадрата = " + getPerimeter(this.a) + "\n" +
                "Площадь квадрата = " + getArea(this.a) + "\n" +
                "Длина диагонали квадрата = " + getDiagonal(this.a);
    }
}
