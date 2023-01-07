package com.MidoHegazi.linkedLists.circulardoublylinkedlist;

import com.MidoHegazi.linkedLists.doublylinkedlist.DoublyLinkedList;
import com.MidoHegazi.linkedLists.doublylinkedlist.DoublyNode;

public class CircularDoublyLinkedList  {
		DoublyNode head;
		DoublyNode tail;
		int size;


		//creating a doubly Linked List
		public DoublyNode createList(int nodeValue){
				DoublyNode node = new DoublyNode();
				node.setValue(nodeValue);
				node.setPrev(null);
				node.setNext(null);
				head=node;
				tail=node;
				tail.setNext(head);
				size++;
				System.out.println("list has been created successfuly!!!");
				return head;
		}

		//inserting a Node as the first node in the list
		public DoublyNode insertNodeAsFirst(int nodeValue){
				if (head == null ){
						createList(nodeValue);
				}else{
						DoublyNode node = new DoublyNode();
						node.setValue(nodeValue);
						node.setNext(head);
						head.setPrev(node);
						head=node;
						size++;
						System.out.println("The node has been added as the first in the list");

				}
			return head;
		}
		// inserting a node as last node in the list
		public DoublyNode insertAsLastNode (int nodeValue) {
				if (head == null) {
					  return createList(nodeValue);
				}
		    DoublyNode node = new DoublyNode();
				node.setValue(nodeValue);
				node.setPrev(tail);
				node.setNext(head);
				tail.setNext(node);
				tail=node;
				size++;
				System.out.println("the node has been inserted successfuly as last node in the list with tail value of : "+ tail.getValue());
				return tail;
		}
		public void insertNodeInBetween(int index, int nodeValue) {
				if (index <= 0){
					insertNodeAsFirst(nodeValue);
					size++;
					System.out.println("The node has been added as first node in the list <-");
					return;
				}
				if(index >= size){
					insertAsLastNode(nodeValue);
					size++;
					System.out.println("the node has been added as last node in the list ->");
					return;
				}
				DoublyNode node = new DoublyNode();
				DoublyNode temp = new DoublyNode();
				temp = head;
				node.setValue(nodeValue);
				for (int i=0;i<index-1;i++){
					temp = temp.getNext();
				}
				node.setNext(temp.getNext()); //in these couple of lines we first get the next node of our nodeToBe added then we set our nodeToBeAdded as a previous node of it.
				node.getNext().setPrev(node); //in these couple of lines we first get the next node of our nodeToBe added then we set our nodeToBeAdded as a previous node of it.
			  node.setPrev(temp);
			  temp.setNext(node);
				size++;
			System.out.println("added the node has been added at the required index successfuly!!!");
		}
		public void printCDLL() {
				if(head == null){
						System.out.println("the list is Empty!!!");
						return ;
				}
				DoublyNode temp = head;
				for(int i=0;i<size;i++){
						System.out.print(temp.getValue());
						if(i<size-1){
							System.out.print(" ==> ");
						}
						temp=temp.getNext();
				}

				System.out.println("\n");
		}
		public void printBackword(){
			if(head == null){
				System.out.println("this list is empty");
				return;
			}
			DoublyNode temp = new DoublyNode();
			temp = tail;
			for (int i=0;i<size;i++){
				System.out.print(temp.getValue());
				if(i<size-1){
					System.out.print(" ==> ");
				}
				temp=temp.getPrev();
			}
			System.out.println("\n");
		}
		public void deleteByIndex(int index){
			DoublyNode nodeToDelete = new DoublyNode();
			DoublyNode temp = new DoublyNode();
			temp = head;

			if (head == null) {
				System.out.println("this list is Empty");
				return;
			}
			if(index < 0 ){
				System.out.println("Wrong index");
				return;
			}
			if(index==0){
				head=head.getNext();
				head.setPrev(null);
				size--;
				System.out.println("the first node has been deleted successfuly!!!");
				return;
			}
			if (index >= size){
				tail=tail.getPrev();
				tail.setNext(head);
				size--;
				System.out.println("the last node has been deleted successfuly!!!");
				return;
			}

			for (int i=0;i<index-1;i++){
				temp=temp.getNext();
			}
			nodeToDelete=temp.getNext();
			temp.setNext(nodeToDelete.getNext());
			nodeToDelete.getNext().setPrev(temp);
			size--;
			System.out.println("node has been deleted successfuly");

		}

}
