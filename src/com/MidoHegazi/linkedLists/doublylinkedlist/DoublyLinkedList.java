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
				size++;
				return head;
		}
		public DoublyNode addAsFirstNode(int value){
				if (head == null){
						createList(value);
				}
				DoublyNode node = new DoublyNode();
				node.setValue(value);
				node.setPrev(null);
				head.setPrev(node);
				node.setNext(head);
				head=node;
			//	tail=node.getNext();
				System.out.println("the node is added as a frist node successfuly with value of : " + head.getValue());
				size++;
				return head;
		}

		public DoublyNode addAsLastNode(int value){
				if (head == null){
					createList(value);
				}
				DoublyNode node = new DoublyNode();
				node.setValue(value);
				node.setPrev(tail);
				tail.setNext(node);
				node.setNext(null);
				tail=node;
				size++;
				System.out.println("Node has been added as last node in the list successfuly with value of : " + tail.getValue());
		    return tail;
		}

		public void addNodeInBetween(int index,int value){
			if(index <= 0){
					addAsFirstNode(value);
					return;
			}
			if(index >= size){
				addAsLastNode(value);
				return;
			}
			DoublyNode node = new DoublyNode();
			DoublyNode temp = head;
			node.setValue(value);
			for(int i=0;i<index-1;i++){
				temp=temp.getNext();
			}
			// setting the node after the last node before the index
			node.setNext(temp.getNext());
			node.setPrev(temp);
			temp.getNext().setPrev(node);
			temp.setNext(node);
			size++;
			System.out.println(" node has been inserted successfully!!!");

		}


		public void printDLL() {
				if(head == null){
						System.out.println("the list is Empty!!!");
						return ;
				}
				DoublyNode node = head;
				for(int i = 0; i<size;i++){
						System.out.print(node.getValue());
						if(i<size-1){
								System.out.print(" ==> ");
						}
						node = node.getNext();
				}
				System.out.println("\n");
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

		public void deleteNode(int index){

			if(index <= 0 ){
				head=head.getNext();
				head.setPrev(null);
				System.out.println("first node has been deleted successfuly ");
				size--;
				return;
			}
			if(index >= size){
				tail=tail.getPrev();
				tail.setNext(null);
				System.out.println("last node has been deleted successfuly ");
				size--;
				return;
			}
			DoublyNode temp = head;
			DoublyNode toDelete= new DoublyNode();
			for(int i=0;i<index-1;i++){
				temp=temp.getNext();
			}
			DoublyNode node = temp.getNext();
			toDelete = temp.getNext();
			temp.setNext(toDelete.getNext());
			toDelete.getNext().setPrev(temp);
			toDelete.setPrev(null);
			toDelete.setNext(null);
			size--;
			System.out.println("the list has been deleted successfuly");
		}

		public void deleteList(){
			head = null;
			tail.setPrev(null);
			System.out.println("list has been deleted successfuly");
			size=0;
		}

}
