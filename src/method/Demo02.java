package method;
//递归思想
public class Demo02 {
    public static void main(String[] args) {
//    Demo02 te = new Demo02(); 死循环调用
//    te.test();

        System.out.println(f(10));//符合递归调用，最终有边界
    }

    private void test() {
        test();
    }

    /**
     * 阶乘
     * @param n
     * @return
     */
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
