package com.MidoHegazi.linkedLists.tuleskoImplementation;

public class Nod {
	private int data;
	private Nod next;

	public int getData() {
		return data;
	}

	public Nod setData(int data) {
		this.data = data;
		return this;
	}

	public Nod getNext() {
		return next;
	}

	public Nod setNext(Nod next) {
		this.next = next;
		return this;
	}
}
