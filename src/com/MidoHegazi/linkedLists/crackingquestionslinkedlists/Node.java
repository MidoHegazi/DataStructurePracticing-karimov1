package com.MidoHegazi.linkedLists.crackingquestionslinkedlists;

public class Node {
	private int value;
	private Node prev;
	private Node next;

	public int getValue() {
		return value;
	}

	public Node setValue(int value) {
		this.value = value;
		return this;
	}

	public Node getPrev() {
		return prev;
	}

	public Node setPrev(Node prev) {
		this.prev = prev;
		return this;
	}

	public Node getNext() {
		return next;
	}

	public Node setNext(Node next) {
		this.next = next;
		return this;
	}

}
