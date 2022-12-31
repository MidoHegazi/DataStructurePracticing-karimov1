package com.MidoHegazi.linkedLists.ripassolinkedlist27122022;

public class app {
	public static void main (String [] args){
		SinglyLinkedList csll = new SinglyLinkedList();
		csll.LinkedListTraversal();
		csll.addNodeAtFirst(20);
		csll.LinkedListTraversal();
		csll.addNodeAtLast(60);
		csll.LinkedListTraversal();
		System.out.println(csll.getSize());
		csll.addNodeInBetween(1,40);
		csll.LinkedListTraversal();
	}
}
