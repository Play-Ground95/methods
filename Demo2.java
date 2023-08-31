import java.util.Scanner;

public class Demo2 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        String city;
        int age;
        boolean valid;

        name = getUserInput("name");

        ageValidation:
        do{
            valid = true;
            System.out.print("Enter your age: ");
            age = SCANNER.nextInt(); 
            SCANNER.nextLine();
            
            if (age < 5 || age > 55){
                System.out.println("Invalid age");
                valid = false;
                continue;
            }
        }while(!true);

        city = getUserInput("city");
        String country = getUserInput("country");

        System.out.printf("name=%s, age=%s, city=%s, country=%s \n",
            name, age, city, country);
    }

    public static String getUserInput(String input){
        boolean valid;
        String value;

        inputValidation:
        do {
            valid = true;
            System.out.printf("Enter your %s: ", input);
            value = SCANNER.nextLine().strip();

            /* Empty */
            if (value.isBlank()){
                valid = false;
                System.out.printf("%s can't be empty \n", input);
                continue;
            }

            /* Format (Letters and Spaces) */
            for (int i = 0; i < value.length(); i++) {
                if (!(Character.isLetter(value.charAt(i)) || 
                Character.isSpaceChar(value.charAt(i)))){
                    valid = false;
                    System.out.printf("Invalid %s \n", input);
                    continue inputValidation;
                }
            }            
        }while (!valid);  

        return value;      
    }
}