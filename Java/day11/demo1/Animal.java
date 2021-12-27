package Java.day11.demo1;
/**
 * 使用模板设计模式模拟完成动物类下的猫和狗的日常活动
 */
public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    public final void play() {
        eat();
        sleep();
    }
}
