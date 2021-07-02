package com.bridgelabz.queue;

public class QueueMain {

	public static void main(String[] args) {
		
		QueueService<Integer> queueService = new QueueService<Integer>();
		
		queueService.enqueue(30);
		queueService.enqueue(40);
		queueService.enqueue(20);
		queueService.enqueue(50);
		queueService.display();
		
		queueService.dequeue();
		queueService.display();

	}

}
