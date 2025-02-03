public class Main {
    public static void main(String[] args) {


        double creditBalance = 5000;
        double interestRate = .17;
        double monthlyInterestRateOne;
        double monthlyInterestRateTwo;

        monthlyInterestRateOne = creditBalance + (creditBalance*interestRate);
        creditBalance = monthlyInterestRateOne;


        System.out.println("After one month, the balance is: "); System.out.println(creditBalance);

        monthlyInterestRateTwo = creditBalance + (creditBalance*interestRate);
        creditBalance = monthlyInterestRateTwo;

        System.out.println("After two months, the balance is: "); System.out.println(creditBalance);




    }
}