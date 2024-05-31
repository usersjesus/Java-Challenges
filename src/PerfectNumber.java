public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber( int number) {

        if (number < 1) {
            return false;
        }

        int curr = 1;
        int sum = 0;

        while (curr < number) {
            if (number % curr == 0) {
                sum += curr;
            }

            curr++;
        }

        return sum == number;
    }
}
