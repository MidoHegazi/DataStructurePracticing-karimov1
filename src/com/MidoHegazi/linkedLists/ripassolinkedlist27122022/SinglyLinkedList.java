package com.MidoHegazi.linkedLists.ripassolinkedlist27122022;

import com.MidoHegazi.linkedLists.Node;

public class SinglyLinkedList {
		private Node head;
		private Node tail;
		private int size;

		public Node getHead() {
				return head;
		}

		public SinglyLinkedList setHead(Node head) {
				this.head = head;
				return this;
		}

		public Node getTail() {
				return tail;
		}

		public SinglyLinkedList setTail(Node tail) {
				this.tail = tail;
				return this;
		}

		public int getSize() {
				return size;
		}

		public SinglyLinkedList setSize(int size) {
				this.size = size;
				return this;
		}

		@Override
		public String toString() {
				return "SinglyLinkedList{" +
					"head=" + head +
					", tail=" + tail +
					'}';
		}

		public void createList(int value){
				Node nodeToAdd = new Node();
		    nodeToAdd.setValue(value);
				head=nodeToAdd;
				tail=nodeToAdd;
				size++;
				System.out.println("New LinkedList with first node :"+ nodeToAdd.getValue()+"has been created successfuly!");
		}
		public Node addNodeAtFirst(int nodeValue){
				if (head==null){
					createList(nodeValue);
					return head;
				}else{
					Node node = new Node();
					node.setValue(nodeValue);
					node.setNext(head);
					head=node;
					tail=node.getNext();
					size++;
				}
				return head;
		}
		public Node addNodeAtLast(int nodeValue){
				if(head == null){
					createList(nodeValue);
					return head;
				}else{
					Node node = new Node();
					node.setValue(nodeValue);
				  tail.setNext(node);
					tail = node;
					size++;
				}
				System.out.println("the last node now is updated with value of :"+ tail.getValue());
				return tail;
		}
		public void addNodeInBetween(int index , int nodeValue) {
				if (head == null){
					createList(nodeValue);
					return;
				}
				Node node = new Node();
				node.setValue(nodeValue);
				Node temp = head;
				for(int i=0;i<index-1;i++){
						temp = temp.getNext();
				}
				node.setNext(temp.getNext());
				temp.setNext(node);
				size++;
				System.out.println("the node has been inserted successfully at ");
		}
		public void LinkedListTraversal(){
				if( head == null){
						System.out.println("the list is empty!!!");
						return;
				}
				Node node = head;
			  for(int i=0;i<size;i++){
				    System.out.print(node.getValue());
						node = node.getNext();
						if (i<=size-2){
								System.out.print(" => ");
						}

			  }
			System.out.println("\n");
		}


}
