/**
 * 
 */
package z.java.util;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.EventObject;
import java.util.List;

import org.junit.Test;

/**
 * 监听器模式
 * 
 * @author Administrator
 *
 */
public class EventListenerTest {

	@Test
	public void test() {
		Client c = new Client();
		c.addListener(new MonitorEventListenerImpl());
		c.noProductSource();
		c.productSource();
		
	}
   //被监听事件的产生与发出被监听事件至监听实现类
	public static class Client {

		private List<MonitorEventListener> listers = new ArrayList<MonitorEventListener>();

		public void addListener(MonitorEventListener listener) {
			listers.add(listener);
		}

		
		public void noProductSource(){
			System.out.println("it is not a event source");
		}
		public void productSource() {
			EventSource s = new EventSource();
			s.setId(10000); // 由于事件源的发生，引发监听事件产生

			MonitorEvent event = new MonitorEvent(s);
			fire(event);
		}

		public void fire(MonitorEvent event) {
			for (MonitorEventListener m : listers) {
				m.addEvent(event);
			}
		}
	}

	public static interface MonitorEventListener extends EventListener {
		public void addEvent(MonitorEvent event);
	}
   //监听器实现，任务就是监听远程的事件
	public static class MonitorEventListenerImpl implements
			MonitorEventListener {

		@Override
		public void addEvent(MonitorEvent event) {
			EventSource e = (EventSource) event.getSource();
			System.out.println("事件源id是" + e.getId());
		}

	}

	// 被监听的事件
	public static class MonitorEvent extends EventObject {
		/**
		 * @param source
		 */
		public MonitorEvent(EventSource source) {
			super(source);
		}

	}

	// 事件源
	public static class EventSource {
		private int id;

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id
		 *            the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

	}
}
