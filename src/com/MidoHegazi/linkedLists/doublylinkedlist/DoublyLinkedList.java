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
	
	public void printDLLBackward(){
		if (tail==null){
			System.out.println("this list is empty!!!");
			return;
		}
		DoublyNode temp = tail;
		for(int i=size-1;i>=0;i--){
			System.out.print(temp.getValue());
			if(i>=1){
				System.out.print(" ==> ");
			}
			temp= temp.getPrev();
		}
		System.out.println("\n");
	}

}
