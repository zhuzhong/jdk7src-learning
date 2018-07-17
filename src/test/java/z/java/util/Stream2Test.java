/**
 * 
 */
package z.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author zhuzhong
 *
 */
public class Stream2Test {

	@Test
	public void reduce() {
		/*Integer s = Stream.of(10, 1, 2, 3, 5, 6, 7, 4, 8, 9)
				//流并行
				.parallel() 
				.reduce(0, (a, b) -> {
			System.out.println("ThreadId=" + Thread.currentThread().getId() + ",a=" + a + ",b=" + b);
			return a + b;
		}, (c, d) -> {
			System.out.println("ThreadId=" + Thread.currentThread().getId() + ",c=" + c + ",d=" + d);
			return c + d;
		});
		System.out.println(s);*/
		
		List<String> list=new ArrayList<>();
		list.add("s1");
		list.add("s444");
		list.add("sreff");
		print(list);
		String r=list.stream().filter(a->"sreff1".equals(a))
		.findFirst()
		.orElse(null);
		
		print(list);
		System.out.println("----");
		System.out.println(r);
		
		r=list.stream().filter(a->"sreff2".equals(a))
				.findFirst()
				.orElseGet(()->{
					return new String("ddd新建默认值");
				});
				
				print(list);
				System.out.println("----");
				System.out.println(r);
				
	}
	
	private void print(List<String> s){
		System.out.println("----");
		s.forEach(System.out::println);
	}
}
