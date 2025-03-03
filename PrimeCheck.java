public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29; // Change this number to test
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + " is " + (isPrime ? "a Prime Number" : "not a Prime Number"));
    }
}
