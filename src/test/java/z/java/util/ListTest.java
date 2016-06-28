/**
 * 
 */
package z.java.util;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class ListTest {

	private List<String> list;

	@Before
	public void init() {
		list = new ArrayList<String>();
		for(int i=0;i<10;i++){
			list.add("zhuzhong"+i);
		}
	}
	@Test
	public void size(){
		Assert.assertEquals(10, list.size());
	}
	
	@Test
	public void isEmpty(){
		Assert.assertFalse(list.isEmpty());
	}
	
	
	
}
