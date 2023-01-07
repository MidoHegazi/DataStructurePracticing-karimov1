package com.MidoHegazi.linkedLists.circulardoublylinkedlist;

import com.MidoHegazi.linkedLists.doublylinkedlist.DoublyNode;

public class app {
	public static void main (String [] args) {
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.printCDLL();
		list.createList(5);
		list.insertNodeAsFirst(3);
		list.insertAsLastNode(7);
		list.printCDLL();
		//adding in between
		list.insertNodeInBetween(1,4);
		list.printCDLL();
		//printing backward
		list.printBackword();
		list.deleteByIndex(1);
		list.printCDLL();
	}

}
