package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedListService;

public class QueueService<T> {

	LinkedListService<Integer> queue = new LinkedListService<Integer>();
	Queue<T> head;
	Queue<T> tail;
	
	public void enqueue(T data) 
	{
		Queue<T> node = new Queue<T>();
		node.data =  data;
		node.next = null;
		if (head == null) {
			this.head = node;
			this.tail = node;
		}
		else 
		{
			tail.next = node;
			tail = node;
		}
	}
	
	public void dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{			
			Queue<T> deletedNode = head;
			head = head.next;
			System.out.println("\nDeleted element "+deletedNode.data);
		}
	}
	
	public void display() {
		Queue<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
