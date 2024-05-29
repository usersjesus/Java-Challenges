public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (89, 9, 999));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {

        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstRightMost = first % 10;
        int secondRightMost = second % 10;
        int thirdRightMost = third % 10;

        return firstRightMost == secondRightMost || firstRightMost == thirdRightMost || secondRightMost == thirdRightMost;

    }

    public static boolean isValid(int number) {

        return (number >= 10 && number <= 1000);
    }
}
