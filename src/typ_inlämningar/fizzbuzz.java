package typ_inlämningar;

import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		int input3 = input.nextInt();
		
		for (int i = 1; i <= input3; i++) {
            boolean fizzOrBuzz = false;
            if (i % input1 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i % input2 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(i));
            }
        }
    }
}

