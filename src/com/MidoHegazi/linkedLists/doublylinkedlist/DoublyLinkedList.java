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

}
