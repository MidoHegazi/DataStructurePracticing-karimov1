package com.MidoHegazi.linkedLists.tuleskoImplementation;

public class LinkedListTuleskoImple {

	private Nod head;

  public void  insertAtLast(int data){
		Nod node = new Nod();
		node.setData(data);
		if (head == null){
			head = node;
	  }
		else{

			Nod n = head;
			while(n.getNext()!=null){
				n = n.getNext();
			}
     n.setNext(node);
		}
  }

	public void insertAtFirst(int data){
		Nod node = new Nod();
		node.setData(data);
		node.setNext(head);
		head=node;
	}

	public void insertInBetween(int index, int data){
		Nod node= new Nod();
		node.setData(data);

		if (index == 0){
			insertAtFirst(data);
		}
		Nod n= head;
		for(int i = 0;i<index-1;i++){
			n = n.getNext();
		}

		node.setNext(n.getNext());
		n.setNext(node);
	}

	public void showList(){
		Nod n = head;
		while (n.getNext()!= null){
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());

	}
}
