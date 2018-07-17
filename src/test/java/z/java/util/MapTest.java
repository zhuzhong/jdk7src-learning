/**
 * 
 */
package z.java.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author zhuzhong
 *
 */
public class MapTest {

	@Test
	public void forEach() {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put(i, i);
		}
		map.forEach((k, v) -> {
			System.out.println(k+"----"+v);
			
		});
		
		map.replaceAll((k,v)->{
			return k+v;
		});
		
		System.out.println("---------");
		map.forEach((k, v) -> {
			System.out.println(k+"----"+v);
			
		});
		
		
		map.compute(3, (k,v)->{return k^v;});
		System.out.println("---------");
		map.forEach((k, v) -> {
			System.out.println(k+"----"+v);
			
		});
			
		
		map.merge(3, 100, (v1,v2)->{return v1+v2;} );//指的是同一个key下，value的merge
		
		System.out.println("---------");
		map.forEach((k, v) -> {
			System.out.println(k+"----"+v);
			
		});
	}
}
