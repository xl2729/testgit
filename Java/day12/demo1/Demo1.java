package Java.day12.demo1;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Supplier接口　供给　必须有一个返回值
 */
public class Demo1 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->{
            return new Random().nextInt(101)+100;
        };
        Integer result = supplier.get();
        System.out.println("随机产生一个100-200的整数："+result);
    }
}
