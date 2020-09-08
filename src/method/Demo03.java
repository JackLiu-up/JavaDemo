package method;

import java.util.Scanner;

/**
 * 加减乘除的demo
 */
public class Demo03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        char grade = 'A';
        int b = 0;

        System.out.println("请输入第一个数字:");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }
        System.out.println("请输入运算符:");


        System.out.println("请输入第二个数字:");
        int sum;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        scanner.close();
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int reduce(int a, int b) {
        return a - b;
    }

    private static int cheng(int a, int b) {
        return a * b;
    }

    private static int chu(int a, int b) {
        return a / b;
    }
}
