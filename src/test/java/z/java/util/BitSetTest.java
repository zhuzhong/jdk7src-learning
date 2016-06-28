/**
 * 
 */
package z.java.util;

import java.util.BitSet;

import org.junit.Test;

/**
 * 使用场景 常见的应用是那些需要对海量数据进行一些统计工作的时候，比如日志分析、用户数统计等等
 * 
 * 如统计40亿个数据中没有出现的数据，将40亿个不同数据进行排序等。
 * 现在有1千万个随机数，随机数的范围在1到1亿之间。现在要求写出一种算法，将1到1亿之间没有在随机数中的数求出来
 * 
 * 
 * BitSet用来保存大量的开关信息，数据结构如下： private long[] words = long[n];
 * long是8个字节长，64位，如果需要使用64个开关的话，n为1就可以了； 一般用开关数除64就可以得出n。
 * 
 bitset简介 参见 http://shmilyaw-hotmail-com.iteye.com/blog/1741608
 * @author Administrator
 *
 */
public class BitSetTest {

	
	@Test
	public void set() {
		int count = 10000;
		BitSet bit = new BitSet(count);
		int i = 1000;
		while (i > 0) {
			bit.set((int) (Math.random() * count));
			i--;
		}

		for (int index = 0; index < count; index++) {
			if (bit.get(index)) {
				System.out.print(index + ",");
			}
		}
		System.out.println("end");
	}
}
