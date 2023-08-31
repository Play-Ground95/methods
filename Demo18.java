public class Demo18 {
    public static void main(String[] args) {
        // Identity Conversion
        // Widening Primitive Conversion
        // Boxing, Unboxing Conversion

        int x = 10;               // Identity Conversion

        myMethod1(10);
        myMethod1((byte) 10);
        myMethod2(10);      // Auto-boxing Conversion
        myMethod3(10);      // Identity Conversions

        byte myByte = 10;
        myMethod2(myByte);
        myMethod3(myByte);        // Widening Conversion

        Integer myInt = 10;
        myMethod2(myInt);           // Identity Conversion
        myMethod3(myInt);           // Unboxing Conversion

        Byte myByte2 = 20;
        myMethod1(myByte2);         // Identity Conversion
        // myMethod2(myByte2);         
        myMethod3(myByte2);         // Unboxing -> Widening
    }

    static void myMethod1(Byte myByte){
        System.out.println("myMethod1");
    }

    static void myMethod2(Integer myInt){
        System.out.println("myMethod2");
    }

    static void myMethod3(int myInt){
        System.out.println("myMethod3");
    }
}