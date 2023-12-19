package homework9_2;

public class Vehicle {
    private int speed;

    private class Engine implements Runnable {
        public void run() {
            speed+=50;
            System.out.println("Скорость увеличина на " + speed);
        }
    }

    public void start() {
        Engine start = new Engine();
        System.out.println("Двигатель запущен");
        start.run();
    }

}
