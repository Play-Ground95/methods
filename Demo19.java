public class Demo19 {
    public static void main(String[] args) {
        byte mByte = 10;
        Byte mByte2 = 10;

        myMethod1(mByte);
        myMethod1(mByte2);

        int myInt = 10;
        Integer myInteger = 20;
        myMethod2(myInt);
        myMethod2(myInteger);

        // myMethod2(mByte);
        // myMethod2(mByte2);
        myMethod2((int) mByte);
        myMethod2((int) mByte2);

        myInt = mByte2;
    }

    static void myMethod1(Byte myByte){
        System.out.println("myMethod1");
    }

    static void myMethod2(Integer myInt){
        System.out.println("myMethod2");
    }
}