
public class MethodRefereceDemo {

	public static void main(String[] args) {
		MyInterface i = MethodRefereceDemo::m2;
		i.m1();
	}
	
	public  static void m2() {
		System.out.println("Inside M2 as method reference");
	}

}

interface MyInterface {
	public void m1();
}
