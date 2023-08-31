import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
       myMethod(2);
       myMethod(3);
       myMethod(5);
    // System.out.println(args);
    // System.out.println(args.length);
    // System.out.println(Arrays.toString(args));

    }
    // public static  void myMethod(int [] nums){}

    // public static  void myMethod(double [] nums){} //method overloading

     //public static  void myMethod(int ...nums){}

     public static void myMethod(int count){
            for (int i = 0; i < count; i++) {
                System.out.println("my method :"+i);
            }
            System.out.println("-------------------------");
        }

    
}
