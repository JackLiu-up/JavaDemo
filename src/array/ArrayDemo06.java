package array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6, 3};

        System.out.println(a);

        //排序:升序
        Arrays.sort(a);

        //打印数组元素Arrays.toString
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 0);//数组填充
        System.out.println(Arrays.toString(a));
    }
}
