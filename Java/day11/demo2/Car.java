package Java.day11.demo2;
/**
 * 汽车有两种状态,一种是停止,一种运行; 汽车的内部都有一个发动机;
 * 发动机有一个工作的功能; 如果汽车是运行状态发动机就飞速旋转,
 * 如果汽车是停止状态,发动机停止工作
 * 要求: 使用成员内部类.
 * @param status
 */
public class Car {
    private boolean status;

    public class Engine {
        public void work() {
            if (status) {
                System.out.println("发动机飞速旋转中");
            } else {
                System.out.println("发动机停止工作");
            }
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
