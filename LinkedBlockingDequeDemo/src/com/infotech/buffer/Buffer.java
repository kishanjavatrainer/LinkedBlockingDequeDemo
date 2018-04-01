package com.infotech.buffer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

//Shared class used by threads
public class Buffer {
	// BlockingDeque
	private BlockingDeque<Integer> blockingQueue = new LinkedBlockingDeque<Integer>(2);

	public void get() {
		// retrieve from synchronousQueue
		try {
			System.out.println("Consumer received - " + blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void put(int data) {
		try {
			// putting in synchronousQueue
			blockingQueue.put(data);
			System.out.println("Producer produced - " + data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
