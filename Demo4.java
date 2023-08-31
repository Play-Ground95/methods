public class Demo4 {
    public static void main(String[] args) {
        System.out.println("I am in the main method");
        myMethod1(2);
        System.out.println("I am about to exit");
    }

    public static void myMethod1(int count) {
        System.out.println("I am in my method1");
        myMethod2();
        System.out.println("I am back and i am now in my method1 again");
        myMethod3();
    }

    public static void myMethod2() {
        System.out.println("I am in my method2");
    }

    public static void myMethod3() {
        System.out.println("I am in my mothod 3");
    }

}
