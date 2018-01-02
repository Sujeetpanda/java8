import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> cu = s -> System.out.println("Hi "+s);
		cu.accept("Sujeet");
	}

}
