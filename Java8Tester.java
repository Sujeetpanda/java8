import java.util.Arrays;
import java.util.List;

//Sort reverse order of name then by salary
public class Java8Tester {
	public static void main(String args[]) {

		List<Employee> employeeList = Arrays.asList(new Employee("mkyong", 33, 70000), new Employee("alvin", 20, 80000),
				new Employee("jason", 10, 100000), new Employee("iris", 55, 170000), new Employee("sujeet", 33, 70000));

		System.out.println("Employees before sorting *****************************");
		employeeList.forEach(System.out::println);
		System.out.println("Employees After sorting*******************************");
		employeeList.sort((o1, o2) -> {
			int flag = -o1.getName().compareTo(o2.getName());
			if (flag < 0)
				flag = o1.getSalary() - o2.getSalary();
			return flag;
		});
		employeeList.forEach(System.out::println);
	}
}
