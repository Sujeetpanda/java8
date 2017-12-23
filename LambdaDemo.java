public class LambdaDemo {

	public static void main(String[] args) {
		MathInterface mi = (a,b) -> System.out.println("The sum is " + (a + b));
		MathInterface mi2 = (a,b) -> System.out.println("The diff is " + (a - b));
		
		mi.operation(3, 4);
		mi2.operation(3, 4);
	}

}

@FunctionalInterface
interface MathInterface {
	public void operation(int a,int b);
}
