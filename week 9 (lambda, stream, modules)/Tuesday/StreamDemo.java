import java.util.*;
import java.util.stream.*;

class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(4);
		myList.add(42);
		myList.add(2);
		myList.add(21);
		myList.add(1);
		myList.add(15);

		System.out.println("Original list: " + myList);

		Stream<Integer> myStream = myList.stream();

		Optional<Integer> minVal = myStream.min(Integer::compare);
		if(minVal.isPresent()) System.out.println("Minval: " + minVal.get());

		myStream = myList.stream();

		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent()) System.out.println("Maxval: " + maxVal.get());

		Stream<Integer> sortedStream = myList.stream().sorted();

		System.out.println("Sorted stream: ");
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		Stream<Integer> oddVals = 
			myList.stream().sorted().filter((n) -> (n % 2) == 1);

		System.out.println("Odd values: ");
		oddVals.forEach((n)->System.out.print(n + " "));
		System.out.println();

		oddVals = myList.stream()
						.filter((n) -> (n%2) == 1)
						.filter((n) -> n > 5);

		System.out.println("Odd values greater than 5: ");
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();
	}
}