public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int curr = 1;
        int gcd = 0;
        int min = Math.min(first, second);


        while (curr <= min) {
            if (first % curr == 0 && second % curr == 0) {
                gcd = curr;
            }

            curr++;
        }

        return gcd;
    }
}
