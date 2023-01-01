package com.MidoHegazi.linkedLists.doublylinkedlist;

public class DoublyNode {
	private int value;
	private DoublyNode prev;
	private DoublyNode next;

	public int getValue() {
		return value;
	}

	public DoublyNode setValue(int value) {
		this.value = value;
		return this;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public DoublyNode setPrev(DoublyNode prev) {
		this.prev = prev;
		return this;
	}

	public DoublyNode getNext() {
		return next;
	}

	public DoublyNode setNext(DoublyNode next) {
		this.next = next;
		return this;
	}
}
