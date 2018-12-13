package com.linkedlist;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		list.insert(18);
		list.insert(15);
		list.insert(20);
		list.insertAtStart(25);
		list.insertAt(2, 55);
		list.insertAt(0, 55);
		list.deleteAt(2);
		list.show();

	}

}
