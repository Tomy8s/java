package FizzBuzz;

/**
 * Created by tom on 06/01/17.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        for(int a = 1; a < 100; a++)
        System.out.println(fizzOrBuzz(a));
    }

    public static String fizzOrBuzz(int a) {
        if (a % 15 == 0) {
            return "FizzBuzz";
        } else if (a % 5 == 0) {
            return "Buzz";
        } else if (a % 3 == 0) {
            return "Fizz";
        } else {
            return "" + a;
        }
    }
}
