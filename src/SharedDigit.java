public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        int firstLeftDigit = firstNumber / 10;
        int firstRightDigit = firstNumber % 10;
        int secondLeftDigit = secondNumber / 10;
        int secondRightDigit = secondNumber % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;

    }
}
