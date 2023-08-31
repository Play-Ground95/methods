public class Demo24 {
    public static void main(String[] args) {
        myMethod(10);
        //1.without boxing unboxing
        //2. box, unbox
        //3.variable numbers of argument arity method
    }
    static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    static void myMethod(Integer x){
        System.out.println("myMethod(Integer)");
    }
    static void myMethod(Integer ...x){
        System.out.println("myMethod(Integer ..x");
    }
    static void myMethod(int ...x){
        System.out.println("myMethod(int ...x)");
    }

}
