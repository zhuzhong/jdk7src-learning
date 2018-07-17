/**
 * 
 */
package z.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

/**
 * @author zhuzhong
 *
 */
public class StreamTest {
	private List<String> list;

	@Before
	public void init() {
		list = new ArrayList<String>();
		for (int i = 0; i < 1; i++) {
			list.add("zhuzhong" + i);
		}
	}

	@Test
	public void newMethod() {
		print(list);
		Stream<String> ss = list.stream();
		/*
		 * List<String> r = ss.filter(a -> { if (a.contains("zhu")) { return
		 * true; } return false;
		 * 
		 * }).map(a -> { return a.toUpperCase();
		 * }).collect(Collectors.toList());
		 */

		Stream<String> s2 = ss.filter(a -> {
								if (a.contains("zhu")) {
									return true;
								}
								return false;
							})
							.map(String::toUpperCase)
							.flatMap(a -> {
								return characterStream(a);
							})
							.sorted()
							.distinct()

				.peek(e -> System.out.println("Filtered value: " + e))
				// .limit(3)
				.skip(2)

		;

		print(s2.collect(Collectors.toList()));

	}

	public static Stream<String> characterStream(String s) {
		List<String> result = new ArrayList<>();
		for (char c : s.toCharArray())
			result.add(String.valueOf(c));
		return result.stream();
	}

	private void print(List<String> s) {
		System.out.println("-------------");
		s.forEach(a -> {
			System.out.println(a);
		});
	}
}
