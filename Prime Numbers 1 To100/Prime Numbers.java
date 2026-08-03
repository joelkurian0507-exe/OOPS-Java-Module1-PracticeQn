package Module1;

public class PrimeNumbers1To100 {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(num + " ");
        }
    }
}
