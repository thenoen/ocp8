import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by marek on 25/02/17.
 */
public class ReduceTerminalOperationExperiment {

	public static void main(String[] args) {
		doIt("a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");
		doIt("a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d");
		doIt("a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c");
		doIt("a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a", "b", "a");
//		doIt("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r");

		System.out.println(System.getProperty("file.separator"));
		System.setProperty("file.separator", "*");
		System.out.println(System.getProperty("file.separator"));
		Path p1  = Paths.get("/a/b");
		Path p2  = Paths.get("c.txt");
//		try {
		System.out.println(p1.resolve(p2));
		System.out.println(System.getProperty("file.separator"));
//		} catch (IOException e) {
//
//		}

		int number1 = 0b0111;
		int number2 = 0111_000;
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
	}

	private static void doIt(String... param) {
		System.out.println(param.length);
		List<String> vals = Arrays.asList(param);
		String join = vals.parallelStream()
//				.peek(System.out::println)
				.reduce("_", (a, b) -> {
//					System.out.println("reducing " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
					return a.concat(b);
				}, (a, b) -> {
//					System.out.println("combining " + a + " and " + b + " Thread: " + Thread.currentThread().getName());
					return a.concat(b);
				});
		System.out.println(join);

//		test(new ArrayList(), (List l) -> l.isEmpty());

		List<?> l = new ArrayList<String>();

		System.out.println(Duration.parse("P0DT1H112M3.01S"));
	}

	public static void test(ArrayList l, Predicate<ArrayList> p) {
		p.test(l);
	}

}
