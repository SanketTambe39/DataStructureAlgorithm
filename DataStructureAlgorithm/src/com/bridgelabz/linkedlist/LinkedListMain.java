package com.bridgelabz.linkedlist;

public class LinkedListMain<T> {

	public static void main(String[] args) {
		
		LinkedListService<Integer> linkedListService = new LinkedListService<Integer>();
		
		linkedListService.add(70);
		linkedListService.add(30);
		linkedListService.add(56);
		
		linkedListService.display();
	}

}