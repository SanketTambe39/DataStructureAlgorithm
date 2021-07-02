package com.bridgelabz.queue;

public class Queue<T> {

	public T data;
	public Queue<T> next;
	public Queue() {
		super();
	}
	public Queue(T data, Queue<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	
}
