/**
 * 
 */
package z.java.util;

import java.util.EnumMap;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class EnumMapTest {
	enum Action {
		TURN_LEFT, TURN_RIGHT, SHOOT
	}

	@Test
	public void test() {
		EnumMap<Action, String> map = new EnumMap<Action, String>(Action.class);

		// input
		map.put(Action.SHOOT, "射击");
		map.put(Action.TURN_LEFT, "左转");
		
		map.put(Action.TURN_RIGHT, "左右转");
		map.put(Action.TURN_RIGHT, "右转");
		// 后面进去相同的key时，不会重复叠加，但是信息（值）会更新！
		// output
		for (String x : map.values())
			System.out.println(x);
	}

}
