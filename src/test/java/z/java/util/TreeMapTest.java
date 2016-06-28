/**
 * 
 */
package z.java.util;

import java.util.TreeMap;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TreeMapTest {

	private TreeMap<Integer, String> treeMap;

	@Before
	public void init() {
		treeMap = new TreeMap<>();
		for (int i = 0; i < 10; i++) {
			if (i % 5 == 0) {
				continue;
			}
			treeMap.put(i, "zhuzhong" + i);
		}
	}

	
	@Test
	public void ceilingKey() {
		// 返回大于等于给定键的最小键；如果不存在这样的键，则返回 null。
		Integer key = treeMap.ceilingKey(5);
		Assert.assertEquals(6, key == null ? 0 : key.intValue());
	}

	@Test
	public void get() {
		String result = treeMap.get(7);
		Assert.assertEquals("zhuzhong7", result);
	}
}
