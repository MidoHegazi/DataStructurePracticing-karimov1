package com.MidoHegazi.linkedLists;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createSingLinkedList (int nodeValue){
		Node node = new Node();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		return head;
	}
}
class Main{
	public static void main (String [] args){
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		Node result = singleLinkedList.createSingLinkedList(5);

		System.out.println(result.getValue());
		System.out.println(result.getNext());
	}
}