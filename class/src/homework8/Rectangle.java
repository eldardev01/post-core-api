package homework8;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int returnArea(int a, int b) {
        return a*b;
    }

    @Override
    public String toString() {
        return
                "Площадь прямоугольника = " + returnArea(this.a,this.b);
    }
}
