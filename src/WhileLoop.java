public class WhileLoop {

    public static void main(String[] args) {

        int num = 4;
        int evenNumbersFound = 0;
        int oddNumberFound = 0;

        while (num <= 20) {
            num++;
            if (isEvenNumber(num)) {
                evenNumbersFound++;
            } else {
                oddNumberFound++;
            }

            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println(evenNumbersFound);
        System.out.println(oddNumberFound);
    }

    public static boolean isEvenNumber(int num) {

        return num % 2 == 0;
    }
}
