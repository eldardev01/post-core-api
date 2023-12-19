package homework9_2;

public class Outer {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }
    private class Inner {
        public void incNumber() {
            number++;
            System.out.println("Увеличение числа " + number);
        }
    }

    public void inc(){
        Inner inner = new Inner();
        inner.incNumber();
    }
}
