public class Demo5 {
    public static void main(String[] args) {
        int a=5;
        int [] b={5};

        myMethod1(a);
        System.out.println(a);
        myMethod2(b);
        System.out.println(b);
    }

    public static void myMethod1(int num){
        num=10;
    }
     public static void myMethod2(int[] nums){
        nums[0]=10;
    }
}
