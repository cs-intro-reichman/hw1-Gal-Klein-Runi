// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		double check = Double.parseDouble(args[3]);
		double price_each = Math.ceil(check/3);

		String namesPrint = "Dear " + name3 + ", " + name2 + ", and " + name1;
		String pricePrint = ": pay " + price_each + " Shekels each.";
	
		System.out.println(namesPrint + pricePrint);
		
	}
}
