package assignment;

public class Withinbuild {


	public static String reverseString(String input) {
		StringBuilder reversed = new StringBuilder(input);
		reversed.reverse();
		return reversed.toString();
		}

		public static void main(String[] args) {
		String original = "HCL Technologies";
		String reversed = reverseString(original);
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
		}
}
