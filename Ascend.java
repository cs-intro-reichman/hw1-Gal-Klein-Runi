// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);

		int min1 = Math.min(a,b);
		int min2 = Math.min(min1,c);
		int smallest = Math.min(min1, min2);

		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		int largest = Math.max(max1, max2);

		int sum = a+b+c;
		int middle = sum-smallest-largest;

		System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.println(c);
		System.out.print(smallest + " ");
        System.out.print(middle + " ");
        System.out.println(largest);
	}
}
