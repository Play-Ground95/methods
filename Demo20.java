public class Demo20 {
    public static void main(String[] args) {
        myMethod1(10);      // strict invocation context
        myFun(20);          // lose invocation context
    }

    static void myMethod1(int x){
        System.out.println("myMethod1");
    }

    // method overloading = compile-time (static) polymorphism

    static void myFun(int x){
        System.out.println("myFun(int)");
    }

    static void myFun(long x){
        System.out.println("myFun(long)");
    }
}