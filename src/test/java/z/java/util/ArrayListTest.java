package z.java.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class ArrayListTest {

	private ArrayList<String> list;

	@Before
	public void init() {
		list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("zhuzhong" + i);
		}
	}

	@Test
	public void subList(){
		List<String> sub=list.subList(3, 7);
		System.out.println(sub);
		sub.add(1, "tttt");
		System.out.println(sub);
		System.out.println(list); //从这可以看出arrlist的子链表与原始链表共用同一个存储数组，子链表只是指针的变化
	}
	@Test
	public void retainAll() {
		// 作交集
		ArrayList<String> cha = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			cha.add("zhuzhong" + i);
		}
		cha.add("ttt");
		list.retainAll(cha);
		System.out.println(list);
	}
	@Test
	public void removeAll() {
		// 作差集
		ArrayList<String> cha = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			cha.add("zhuzhong" + i);
		}
		cha.add("ttt");
		list.removeAll(cha);
		System.out.println(list);
	}

	@Test
	public void tt() {
		int i = 1;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);
	}

	@Test
	public void tjiajia() {
		String[] a = new String[10];
		int index = 3;
		a[index++] = "inedx3"; // 它的作用将数组a坐标为3的值设为index3,并将index的值向前推进一
		System.out.println(a[3]);
		System.out.println(index);

		index = 7;
		a[--index] = "index6";
		System.out.println(a[6]);
		System.out.println(index);
	}

	@Test
	public void ensureCapacity() {
		int capa = 13;
		list.ensureCapacity(capa);
		System.out.println(list.size());
	}

	@Test
	public void remove() {
		list.remove(5);

		System.out.println(list);
	}

	@Test
	public void remove2() {
		list.remove("zhuzhong5");
		System.out.println(list);
	}

	@Test
	public void trimToSize() {
		list.remove(5);
		list.trimToSize();
		System.out.println(list);
	}

}
