public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));


    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int firstDigit = number;
        int curr = 0;
        int sum = 0;

        while(firstDigit > 0) {
            curr = (firstDigit % 10);

            if (curr % 2 == 0) {
                sum += curr;
            }

            firstDigit /= 10;
        }

        return sum;
    }
}
