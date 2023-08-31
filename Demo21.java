public class Demo21 {
    public static void main(String[] args) {
        myMethod(10);
        myMethod(false);
    }

    // m1:
    static void myMethod(int x){
        System.out.println("myMethod(int)");
    }

    // m2:
    static void myMethod(boolean x){
        System.out.println("myMethod(boolean)");
    }

    /*
     sign(m1) = myMethod(int)
     sign(m2) = myMethod(boolean)
     m1 != m2
     */
}
