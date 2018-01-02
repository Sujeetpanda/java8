
public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		//Using lambda exprsssion
		
		MyInterface i = () -> {
			Sample obj = new Sample();
			return obj;
		};
		
		Sample obj1 = i.get();
		
		//Using constructor reference
		MyInterface i2 = Sample::new;
		Sample obj2 = i2.get();

	}

}

class Sample {
	public Sample() {
		System.out.println("Inside sample constructor");
	}
}

interface MyInterface {
	public Sample get();
}