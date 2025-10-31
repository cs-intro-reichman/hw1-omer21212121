// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	double currentValue = Double.parseDouble(args[0]);
	double interestRate = Double.parseDouble(args[1]);
	int amountOfYears = Integer.parseInt(args[2]);
	double futureAmount = currentValue * Math.pow((1 + (interestRate/100)),amountOfYears);
	System.out.println("After " + amountOfYears + " years, $" + (int) currentValue + " saved at " + interestRate + "% will yield $" + (int) futureAmount);

	}
}