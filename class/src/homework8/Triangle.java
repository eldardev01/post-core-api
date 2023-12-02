package homework8;

import static java.lang.Math.sqrt;

public class Triangle {

    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int printPerimetr(int a, int b, int c) {
        return a+b+c;
    }

    public double printArea(int a, int b, int c) {
        int p = printPerimetr(a,b,c)/2;
        return sqrt((p * (p-a) * (p-b) * (p-c)));
    }

    @Override
    public String toString() {
        return
                "Периметр треугольниа = " +  printPerimetr(this.a,this.b, this.c) + "\n" +
                        "Площадь треугольника = " + printArea(this.a, this.b,this.c);
    }


}
