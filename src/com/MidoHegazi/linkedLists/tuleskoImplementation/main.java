package com.MidoHegazi.linkedLists.tuleskoImplementation;

public class main {
	public static void main (String [] args){
    LinkedListTuleskoImple list = new LinkedListTuleskoImple();
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(5);
		list.insertAtFirst(0);
		list.insertInBetween(2,1);
		list.insertInBetween(3,6);
		list.showList();
	}
}
