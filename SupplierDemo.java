import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> sup = () -> 10;
		System.out.println(sup.get());
	}

}
