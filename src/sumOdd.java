public class sumOdd {

    public static void main(String[] args) {

        System.out.println(sumoOfOdd(1, 89));

    }

    public static boolean isOdd(int number) {

        if (number <= 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumoOfOdd(int start, int end) {

        int sum = 0;

        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                sum += (isOdd(i)) ? i : 0;
            }

            return sum;
        }

        return -1;
    }
}
