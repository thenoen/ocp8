package functional_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class FunctionalInterfaceExperiments {


	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		BiConsumer<String, String> biConsumer = map::put;
		BiConsumer<String, String> biConsumer2 = (k, v) -> map.put(k, v);
		BiConsumer<String, String> biConsumer3 = (k, v) -> {map.put(k, v);};

		biConsumer.accept("my", "name");

		System.out.println(map);

		useConsumer(s -> {
			System.out.println(s);
			returnInput(s);
		});

		useConsumer(FunctionalInterfaceExperiments::returnInput);

		useFunction(s -> {
			System.out.println(s);
			return returnInput(s);
		});

		useFunction(s -> FunctionalInterfaceExperiments.returnInput(s));
		useFunction(FunctionalInterfaceExperiments::returnInput);
//		useFunction(s -> {FunctionalInterfaceExperiments.returnInput(s);}); // compilation error - missing return statement


	}

	private static String returnInput(String input) {
		return input;
	}

	private static void useConsumer(MyConsumer<String> myFunctionalInterface) {
		myFunctionalInterface.doStuff("input_string");
	}

	private static void useFunction(MyFunction<String> myFunctionalInterface) {
		String s = myFunctionalInterface.doStuff("input_string2");
		System.out.println(s);
	}
}


@FunctionalInterface
interface MyConsumer<T> {
	void doStuff(T t);
}


@FunctionalInterface
interface MyFunction<T> {
	T doStuff(T t);
}
