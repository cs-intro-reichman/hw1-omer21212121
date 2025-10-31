// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double a = Math.random() * Integer.parseInt(args[0]);
	    double b = Math.random() * Integer.parseInt(args[0]);
		double c = Math.random() * Integer.parseInt(args[0]);
		double smallNum = Math.min (a, Math.min(b,c));
		double bigNum = Math.max(a, Math.max(b,c));
		double mediumNum = (a+b+c)-(smallNum +bigNum);
		System.out.println((int) a + " " + (int) b + " " + (int) c);
		System.out.println((int) smallNum + " " + (int) mediumNum + " " + (int) bigNum);

	}
}
