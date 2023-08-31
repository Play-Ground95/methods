import java.io.Serializable;
import java.util.Calendar;

public class Demo1 {

    /* 
        Methods = Procedures = Functions = Routines = Internal API
        API - Application Programming Interface

        Why do we need methods? 
        1. Reusability with Parameter Passing
        2. Modularity
        3. Abstraction (Idea) and Encapsulation
        4. Easier to maintain and Easier to test
        5. Isolated Scope (for Local Variables/Constants)
        
    */
    public static void main(String ...args) {
        /* Expression Statements

         * 1. Assignment
         * 2. PostFix Increment
         * 3. PostFix Decrement
         * 4. Prefix Increment
         * 5. Prefix Decrement
         * 6. Method Invocation
         * 7. Object Creation
         */

        myMethod1();
        myMethod2(10, 20);

        // Parameters vs Arguments

        /* There is no such rule that I need to use a return value of a method*/
        myFun(5);   

    }

    public static void myMethod1(){
        return; // Here return is optional
        // System.out.println("IJSE"); <- Unreachable Statement
    }

    public static void myMethod2(int x, int y){}

    // f(x) = x^x + 2x + 3
    public static int myFun(int x){
        return x * x + 2 * x + 3;   // Here return is mandatory
        // System.out.println("IJSE"); <- Unreachable Statement
    }

    // g(x,y) = x + 2 * y;
    public static double myFun2(int x, int y){
        return x + 2 * y;
    }
}