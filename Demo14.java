public class Demo14{
    public static void main(String[] args) {
        int value = twoPower(3);
        System.out.println(value);
    }
    private static int twoPower(int i){
        if (i == 0) {
            return 1; 
        } else {
            return 2 * twoPower(i - 1); 
        }
    }

}
