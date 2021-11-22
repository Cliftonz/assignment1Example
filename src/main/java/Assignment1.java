
public class Assignment1 {

    /**
     * In this section you need to explain what each input is and what it does in the function and explain the output.
     * @param investmentAmount initial investment amount
     * @param monthlyInterestRate interest rate over every month as a percentage
     * @param numberOfYears integer representing the number of year to calculate the growth of the investment amount
     * @return possible earnings
     */
    public static double CalculateFutureInvestment(int investmentAmount, double monthlyInterestRate, int numberOfYears){
        return investmentAmount * Math.pow((1 + monthlyInterestRate / 100), numberOfYears * 12 );
    }

}
