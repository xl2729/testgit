package Java.day11.demo2;

public class Car {
    boolean status;

    class Engine {
        public void work() {
            if (getStatus() == true) {
                System.out.println("发动机飞速旋转中");
            } else {
                System.out.println("发动机停止工作");
            }
        }
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
