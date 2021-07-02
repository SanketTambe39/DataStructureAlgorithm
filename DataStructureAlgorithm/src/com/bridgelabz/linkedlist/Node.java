package com.bridgelabz.linkedlist;

public class Node<T> {

	public T data;
	public Node<T> next;
	
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}