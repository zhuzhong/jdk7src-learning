/**
 * 
 */
package z.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author Administrator
 *
 */
public class ListTest {

	private List<String> list;

	@Before
	public void init() {
		list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("zhuzhong" + i);
		}
	}

	@Test
	public void size() {
		Assert.assertEquals(10, list.size());
	}

	@Test
	public void isEmpty() {
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void newMethod() {
		list.replaceAll(t -> {
			return t + "--ok";
		});
		list.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("--------");
		list.sort((a, b) -> {
			return b.compareTo(a);
		});
		list.forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("-----");
		Spliterator<String> sp=list.spliterator();
		
	}
}
