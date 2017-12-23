public class RunnableDemoJava8 {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(r,"First Thread");
		t1.start();
		new Thread(r,"Second Thread").start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside main method");
		}
	}
}
