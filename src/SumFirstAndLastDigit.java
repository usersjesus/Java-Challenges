public class SumFirstAndLastDigit {

    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = number % 10;
        int firstDigit = number;

        if (number < 0 ) {
            return -1;
        }

        while(firstDigit > 9) {
            firstDigit /= 10;
        }

        return lastDigit + firstDigit;
    }
}
