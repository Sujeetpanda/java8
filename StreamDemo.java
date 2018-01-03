import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Sujeet");
		list.add("Ram");
		list.add("Chandra");
		list.add("Dhaus");
		list.add("bb");
		list.add("Vikrabandi");
		
		System.out.println(list);
		
		List<String> filteredList = list.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		
		System.out.println("The filtered list is                 " + filteredList);
		
		List<String> mappedList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("The mapped list is                   "+mappedList);
		
		long count = list.stream().filter(s -> s.length() > 5).count();
		
		System.out.println("The number of filtered names is " + count);
		
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(20);
		nums.add(15);
		nums.add(25);
		nums.add(35);
		nums.add(10);
		nums.add(45);
		
		//Optional<T> max(Comparator<? super T> comparator)
		Integer min = nums.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		
		System.out.println("The minmum value is " + min);
		
		Integer max = nums.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		
		//Optional<T> max(Comparator<? super T> comparator)
		System.out.println("The maximum value is " + max);
		
		System.out.println(nums.stream().sorted().collect(Collectors.toList()));
		
		//sorted(Comparator<? super T> comparator)
		System.out.println(list.stream().sorted((i1,i2) -> i1.length()- i2.length()).collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		System.out.println(list.stream().sorted(Comparator.comparing(s -> s.length())).collect(Collectors.toList()));
		
		//void forEach(Consumer<? super T> action)
		list.stream().forEach(s -> System.out.println(s));
		System.out.println("Using funtion reference");
		list.stream().forEach(System.out::println);
		
		//Processing by toArray
		
		String[] outputArrray = list.stream().toArray(String[]::new);
		
		System.out.println("Printing the Array");
		for(String s: outputArrray) {
			System.out.println(s);
		}
		
		//using Stream.of for creating sterams for non collection objects
		Stream.of("sujeet","kumar","panda").forEach(System.out::println);
		System.out.println("Printing an array using Stream of");
		Stream.of(outputArrray).forEach(System.out::println);
	}
}
