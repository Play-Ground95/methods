
    public class Demo13 {
        public static void main(String[] args) {
            printPattern(5);
        }
        
        public static void printPattern(int n) {
            if (n > 1) {
                printRow(n);
                System.out.println();
                printPattern(n - 1);
            }
        }
        
        public static void printRow(int count) {
            if (count > 0) {
                System.out.print("* ");
                printRow(count - 1);
            }
        }

        
    }
    

