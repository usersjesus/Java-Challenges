public class InterestRateChallenge {

    public static void main(String[] args) {

        calculateInterest(35000.00);

    }

    public static void calculateInterest(double amount) {

        for (double rate = 7.50; rate <= 10.00; rate += 0.25) {

            double interestAmount = amount * (rate / 100.00);
            System.out.println("Interest for " + "$" + amount + " at rate " + rate + " is " + "$" + interestAmount);
        }
    }

}
