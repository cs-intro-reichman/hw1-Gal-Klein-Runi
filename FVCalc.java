// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate_p = Double.parseDouble(args[1]);
		double rate = rate_p/100;

		double years = Double.parseDouble(args[2]);

		double futureVal = currentValue*(Math.pow((1+rate),years));

		System.out.println("After " +(int) years+ " years $"+(int) currentValue+" saved at "+ rate_p+"% will yield $"+(int) futureVal);
		
		//System.out.println( Math.ceil(futureVal));

	}
}