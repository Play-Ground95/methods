public class Demo10 {
    static int num=10;
    public static void main(String[] args) {
        System.out.println(num);
        num=20;
        System.out.println(num);
        updateValue();
        System.out.println(num);
    }

    public static void updateValue(){
        num=30;
    }
}
