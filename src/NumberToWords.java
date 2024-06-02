public class NumberToWords {
    public static void main(String[] args) {

//        numberToWords(234);
//        numberToWords(0);
        numberToWords(1450);
//        System.out.println(reverse(-121));
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int originalReversedNumber = reverse(number);
        int numberOfZeros = getDigitCount(number) - getDigitCount(reversedNumber);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }
//        int numberOfDigits = getDigitCount(reversedNumber);

        while (reversedNumber != 0) {
            String digitInWords = switch (reversedNumber % 10) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> throw new IllegalStateException("Unexpected value: " + reversedNumber % 10);
            };

            System.out.println(digitInWords);
            reversedNumber /= 10;

                for(int i = 0; i < numberOfZeros; i++) {
                    System.out.println("Zero");
                }

//            numberOfDigits = getDigitCount(reversedNumber /= 10);

        }
    }

    public static int reverse(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;

        if (number == 0) {
            return 1;
        }

        for (int i = 1; i <= number; i *= 10) {
            count++;
        }

        return count;
    }
}
