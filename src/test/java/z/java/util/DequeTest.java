/**
 * 
 */
package z.java.util;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class DequeTest {

	private Deque<String> deque;

	@Before
	public void init() {
		deque = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			deque.add("zhuzhong" + i);
		}
	}

	@Test
	public void addFirst() {
		System.out.println(deque.iterator().next());
		deque.addFirst("zhuzhong1000");
		System.out.println(deque.iterator().next());
	}
}
