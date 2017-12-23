public class InterfaceAmbiguityProblem implements Int1,Int2{

	public static void main(String[] args) {
		

	}

	@Override
	public void method() {
		Int1.super.method();
	}

}

interface Int1 {
	default void method() {
		System.out.println("Inside Int1");
	}
}

interface Int2 {
	default void method() {
		System.out.println("Inside Int2");
	}
}
