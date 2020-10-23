package funcy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
//		var x = (a, b) => a + b;
		Calculation add = (a, b) -> a + b; // @Override
		int result = add.calc(42, 45);
		System.out.println(result);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Stream<Integer> stream = numbers.stream();

		Predicate<Integer> evens = i -> i % 2 == 0;

		Stream<Integer> filtered = stream.filter(evens);

//		filtered.reduce(Math::max);
		filtered.reduce((acc, next) -> Math.max(acc, next));

//		numbers.forEach(i -> result++); no local variables in lambdas
//		filtered.forEach(System.out::println);

		numbers.forEach(i -> System.out.println(i));

		// IntStream.range(1, 11).
	}

}
