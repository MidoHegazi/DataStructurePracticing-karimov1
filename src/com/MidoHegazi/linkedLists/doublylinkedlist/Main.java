package com.MidoHegazi.linkedLists.doublylinkedlist;

public class Main {
	public static void main (String [] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.createList(20);
		list.addAsFirstNode(10);
		list.addAsFirstNode(5);
		list.addAsLastNode(30);
		list.printDLL();
		//list.printDLLBackward(); to be pulled with conflict
		list.addNodeInBetween(2,15);
		list.printDLL();
		list.addNodeInBetween(-1,2);
		list.printDLL();
		list.addNodeInBetween(9,35);
		list.printDLL();
		list.deleteNode(10);
		list.printDLL();
		//finding a value
		System.out.println(list.findNodeByValue(39));
		//deleting all elements
		list.deleteList();
		list.printDLL();


	}
}
