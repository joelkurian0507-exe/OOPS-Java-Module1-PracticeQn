package Module1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;

        for (; num != 0; num /= 10) {
            rev = rev * 10 + num % 10;
        }

        System.out.println("Reversed Number = " + rev);

        sc.close();
    }
}
