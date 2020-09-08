package method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int a =10;
        int b = 15;
        int sum = add(a,b);
        System.out.println(sum);
        test();
    }

    //加法
    public static int add(int a,int b){
        return a+b;
    }

    public static void test(){
        System.out.println("你是一个强者！");
    }
}
