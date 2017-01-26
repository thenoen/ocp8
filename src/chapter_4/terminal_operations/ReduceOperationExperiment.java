package chapter_4.terminal_operations;

import java.util.Arrays;
import java.util.List;

public class ReduceOperationExperiment {

	public static void main(String[] args) {

		List<Character> list = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k');

		// <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
		// T == Character   |   U == return type
		String result1 = list.stream().reduce("", (String s, Character c) -> s.concat("" + c), String::concat );
		System.out.println(result1);

	}

}
