package com.bridgelabz.stack;

public class StacksService<T>
{

	LinkListService<T> linkedList= new LinkListService<T>();
	public void push(T data) 
	{
		linkedList.add(data);
	}
	public void print()
	{
		linkedList.display();
	}
}
