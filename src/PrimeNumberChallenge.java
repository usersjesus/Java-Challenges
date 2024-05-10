public class PrimeNumberChallenge {

    public static void main(String[] args) {

        System.out.println("The total number of prime number is " + primeCounter(6));

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCounter(int range) {

        int count = 0;

        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            if(count == 3) {
                break;
            }
        }

        return count;
    }
}
