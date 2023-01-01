package com.MidoHegazi.linkedLists.doublylinkedlist;

public class Main {
	public static void main (String [] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.createList(20);
		list.addAsFirstNode(10);
		list.addAsFirstNode(5);
		list.addAsLastNode(30);
		list.printDLL();
	}
}
