/* Paul Castelo*/

public class FizzBuzz {

  /**
  * This console application will go through a set of integers, 1 to 100.
  * Will print out the number, "Fizz", "Buzz" or "FizzBuzz".
  */

    public static void main(String[] args) {

        for(int x = 1; x <= 100; x++ ) {

            if(x % 3 == 0 && x % 5 == 0) {        // If int is a mulitple of 3 and 5

                System.out.println("FizzBuzz");
            }
            else if(x % 3 == 0) {

                System.out.println("Fizz");       // If int is a mulitple of 3
            }
            else if(x % 5 == 0) {

                System.out.println("Buzz");       // If int is a multiple of 5
            }
            else {

                System.out.println(x);            // If int is neither a multiple of 3 or 5
            }

        }

    }
}
