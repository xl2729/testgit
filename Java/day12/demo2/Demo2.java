package Java.day12.demo2;

import java.util.Arrays;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        // int[] arr = new int[2];
        Function<Integer, int[]> f = int[]::new;
        int[] a = f.apply(2);
        a[0] = 1;
        a[1] = 6;
        Function<int[], String> arr = Arrays::toString;
        System.out.println(arr.apply(a));
    }
}