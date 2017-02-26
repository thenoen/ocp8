import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by marek on 25/02/17.
 */
public class GroupingOfListToMap {

	public static class Course{
		private String id;
		private String category;

		public Course(String id, String category){
			this.id = id; this.category = category;
		}

		public String toString(){
			return id+" "+category;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}


	public static void main(String[] args) {

		List<Course> s1 = Arrays.asList(
				new Course("OCAJP", "Java"),
				new Course("OCPJP", "Java"),
				new Course("C#", "C#"),
				new Course("OCEJPA", "Java")
		);

		s1.stream()
				.collect(Collectors.groupingBy(c -> c.getCategory()))
				.forEach((m, n) -> System.out.println(n));

		Map<String, List<Course>> map = s1.stream()
				.collect(Collectors.groupingBy(c -> c.getCategory()));


		System.out.println(0x1f);
		System.out.println(1f);
		System.out.println(01f);
		float bifloat = 0b100000000000001111111111111;
		System.out.println(bifloat);

//		Consumer<String> c = (s) -> String s2 = 1+""; //not working

//		ExecutorService es = null;
//		Future<?> f = es.submit(() -> System.out.println("hello"));

		System.out.println("path: '" + Paths.get("/../a").normalize() + "'");

		return;

	}

	public static <E> List<? super E> get(List<? extends E> a) {
		return new ArrayList<E>();
	}

}
