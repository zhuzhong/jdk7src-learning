/**
 * 
 */
package z.java.concurrent;

import java.io.IOException;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TransferQueueTest {

	private static TransferQueue<Integer> queue = new LinkedTransferQueue<>();

	@Test
	public void transfer() {

		new Thread() {
			public void run() {
				Integer item = null;
				try {
					item = queue.take();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("cousumer consume item=" + item);
			}
		}.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean hasWaitingConsumer = queue.hasWaitingConsumer();
		if (hasWaitingConsumer) {
			try {
				queue.transfer(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				queue.put(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
