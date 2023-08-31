public class Demo23 {
    public static void main(String[] args) {
        short b=5;
        myMethod(10.2f,b, 10.f);
    }
    static void myMethod(float x, double y, int z) {
        System.out.println("myMethod(float,double,int)");
    }
     static void myMethod(float x, float y, float z) {
        System.out.println("myMethod(float,float,float)");
    }
     static void myMethod(float x, double y, float z) {
        System.out.println("myMethod(float,double,float)");
    }
     static void myMethod(long x, float y, int z) {
        System.out.println("myMethod(long,float,int)");
    }
     static void myMethod(double x, float y, float z) {
        System.out.println("myMethod(double,float,float)");
    }
}
