public class Demo16 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = calc(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
    public static int calc(int number){
        // return 0;
        if (number == 0 || number == 1) {
            return 1; // Base case: factorial of 0 and 1 is 1
        } else {
            return number* calc(number- 1); // n! = n * (n-1)!
        }
    }
}
