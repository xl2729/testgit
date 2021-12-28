package Java.day12.demo2;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo1{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //sc.next();
        Function<InputStream, Scanner> f = Scanner::new;    //引用
        Scanner sc = f.apply(System.in);                    //获取
        Supplier<String> s1 = sc::next;
        System.out.println("字符串"+s1.get());
        Supplier<Integer> s2 = sc::nextInt;
        System.out.println("整数："+s2.get());
    }   
}