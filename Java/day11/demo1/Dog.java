package Java.day11.demo1;

public class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    void sleep() {
        System.out.println("狗一天睡６个小时");
    } 
}
