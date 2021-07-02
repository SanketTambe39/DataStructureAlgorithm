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
		linkedListService.clearList();
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
		linkedListService.clearList();
		/*
		 *In this method we are appending the given number 
		 *to the specific position given by the user 
		 */
		System.out.println("\nAbility to add number in between");
		linkedListService.append(56);
		linkedListService.append(70);
		linkedListService.insertAt(1, 30);
		linkedListService.display();

		System.out.println("\nDelete First element");
		linkedListService.popFirst();
		linkedListService.display();
		linkedListService.clearList();
		
		System.out.println("\nDelete Last element");
		linkedListService.append(56);
		linkedListService.append(30);
		linkedListService.append(70);
		linkedListService.popLast();
		linkedListService.display();
		
		System.out.println("\nFinding the element from the list");
		if(linkedListService.search(30))
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element not found");
		}

	}
}