import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		int[] arr = { 0, 5, 10, 15, 20, 25, 30, 35 };
		Predicate<Integer> p = (a) -> (a > 10);
		Predicate<Integer> p2 = (a) -> a % 2 == 0;
		System.out.println("The numbers greater than 10");
		printValues(p, arr);
		System.out.println("The Even numbers are ");
		printValues(p2, arr);
		System.out.println("The numbers not greater than 10");
		printValues(p.negate(), arr);
		System.out.println("The number greater than 10 and even");
		printValues(p.and(p2), arr);
		System.out.println("The number either greater than 10 or even");
		printValues(p.or(p2), arr);
	}

	public static void printValues(Predicate<Integer> p, int[] arr) {
		for (int x : arr) {
			if (p.test(x)) {
				System.out.print(" " + x);
			}
		}
		System.out.println();
	}
}
