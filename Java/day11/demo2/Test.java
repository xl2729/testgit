package Java.day11.demo2;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e = c.new Engine();
        e.work();
        c.setStatus(true);
        e.work();
    }
}
