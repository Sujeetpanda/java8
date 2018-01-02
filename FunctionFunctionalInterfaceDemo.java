import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Sujeet"));
	}

}
