package com.bridgelabz.linkedlist;

public class LinkedListMain<T> {

	public static void main(String[] args) {
		
		LinkedListService<Integer> linkedListService = new LinkedListService<Integer>();
		/*
		 * here we can get the sequence i.e 56->30->70
		 * add method is adding elements to the front side of linked
		 * list
		 */
		System.out.println("Using add method");
		linkedListService.add(70);
		linkedListService.add(30);
		linkedListService.add(56);
		linkedListService.display();
		/*
		 * here we can get the sequence i.e 56->30->70
		 * add method is adding elements to the end side of linked
		 * list
		 */
		System.out.println("\nUsing append method");
		linkedListService.append(56);
		linkedListService.append(30);
		linkedListService.append(70);
		linkedListService.display();	
	}
}