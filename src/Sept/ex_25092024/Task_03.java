package Sept.ex_25092024;

public class Task_03 {
        public static void main(String[] args) {
            // Loop through each number from 1 to 100
            for (int i = 2; i <= 100; i++) {
                boolean isPrime = true;

                // Check if i is divisible by any number from 2 to i-1
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false; // i is not prime
                        break; // No need to check further
                    }
                }

                // If the number is prime, print it
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }

