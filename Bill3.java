// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[2];
	    String name2 = args[1];
		String name3 = args[0];
		double check = Double.parseDouble(args[3]);
		double price_each = Math.ceil(check/3);
	
		System.out.println("Dear "+name3+", "+name2+" and "+
		name1+": pay "+price_each +" Shekels each.");
	}
}
