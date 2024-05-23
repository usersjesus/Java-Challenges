public class DigitSum {

    public static void main(String[] args) {

        System.out.println(sumDigits(-2165));
        System.out.println(sumDigits(1326));
        System.out.println(sumDigits(6));
        System.out.println(sumDigits(-364));
    }

    public static int sumDigits(int number) {

        int sum = 0;
        int newNumber = number;

        if (number < 0) {
            return -1;
        }

        while (newNumber > 0) {
            sum += newNumber % 10;
            newNumber = newNumber /10;
        }

        return sum;
    }
}
