public class Recursion {
    Recursion(){
        /*
            Recursion = When a thing is defined in terms of itself. -Wikipedia
                        Apply the result of a procedure, to a procedure.
                        A recursive method calls itself. Can be a substitute for iteration.
                        Divide method calls itself. Can be a substitute for iteration.
                        Commonly used with advanced sorting algorithms and navigating trees

                        Advantages:
                        1. Easier to read/write
                        2. Easier to debug

                        Disadvantages:
                        1. Sometimes slower
                        2. Uses more memory
        */

        /* it will show how many steps you take */
        walk(5);
        System.out.println();
        /* if we call the method too many times, we will run out of memory */
        walk_Exception(100000);
        System.out.println("\n Factorial number of 7: ");
        System.out.println(factorial(7));
        System.out.println("2^8: ");
        System.out.print(power(2,8));
    }

    static void walk_Exception(int steps) {
        try{
            if(steps < 1) return; /* if the is only 1 statement, we don't need curly braces */
            System.out.println("You take a step");
            walk(steps - 1);
        }
        catch(StackOverflowError SOE){
            System.out.println("Run out of memory");
        }
    }
    static void walk(int steps) {
    /*
        Iterative approach example:

        for(int i = 0; i < steps; i++){
            System.out.println("You take a step");
        }

    */
        /* the recursive way */
        if(steps < 1) return; /* if the is only 1 statement, we don't need curly braces || base case */
        System.out.println("You take a step");
        walk(steps - 1); /* recursive case */
    }
    static int factorial(int num) {

        if (num < 1) return 1; /* base case */
        return num * factorial(num - 1); /* recursive */
    }
    static int power(int base, int exponent) {

        if (exponent < 1) return 1; /* base case */
        return base * power(base, exponent - 1); /* recursive case */
    }
}
