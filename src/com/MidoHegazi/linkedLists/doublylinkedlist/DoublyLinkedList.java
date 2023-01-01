package com.MidoHegazi.linkedLists.doublylinkedlist;

import com.MidoHegazi.linkedLists.Node;

public class DoublyLinkedList {

	public DoublyNode head;
	public DoublyNode tail;
	public int size;


	public DoublyNode createList(int nodeValue){
		if(head != null){
			System.out.println("there is already a linkedList try to insert needed value instead of creating ");
			return null;
		}
		DoublyNode node = new DoublyNode();
		node.setValue(nodeValue);
		node.setNext(null);
		node.setPrev(null);
		head=node;
		tail=node;
		return head;
	}
}
