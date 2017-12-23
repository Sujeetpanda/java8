public class DefaultMethodDemo implements DefaultInterface{

	public static void main(String[] args) {
		DefaultMethodDemo obj = new DefaultMethodDemo();
		obj.method();

	}
	
	//Comment this method to get default interface method
	public void method() {
		System.out.println("Overridden method");
	}

}
interface DefaultInterface {
	default void method() {
		System.out.println("Inside default method");
	}
}
