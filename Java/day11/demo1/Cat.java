package Java.day11.demo1;

public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("吃猫粮");
    }

    @Override
    void sleep() {
        System.out.println("猫一天睡１８个小时");
    }
    
}
