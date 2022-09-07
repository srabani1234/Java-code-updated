package exception;

import java.util.Scanner;

public class Validator {
	
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // int N = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         int value1 = scanner.nextInt();
       System.out.println("The first value was "+value1);
        // scanner.close();
     }

}
