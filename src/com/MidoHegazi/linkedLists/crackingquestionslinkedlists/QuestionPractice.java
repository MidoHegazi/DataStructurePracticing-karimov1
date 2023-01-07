package com.MidoHegazi.linkedLists.crackingquestionslinkedlists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionPractice {
	// remove duplicates from a single linked list
		public void removeDups(LinkedList list) {
				Set<Integer> listNoDups = new HashSet<>();
				Node current = list.head;
				Node temp = null;

				while(current != null){
					int currentValue = current.getValue();
					if(listNoDups.contains(currentValue)){
						temp.setNext(current.getNext());
						list.size--;

					}else{
						listNoDups.add(currentValue);
						temp=current;
					}

					current=current.getNext();
				}

		}
		// method to give the nth values to the last node in the list (not the right one ) cause we need the second value to the last.
//	public int nthValueToLast(LinkedList list , int index) {
//		List<Integer> values = new ArrayList<>();
//		Node current = new Node();
//		current= list.head;
//		while(current!= null){
//			values.add(current.getValue());
//			current=current.getNext();
//		}
//		 if(index > values.size()){
//			 System.out.println("wrong index please check and insert the right index");
//		 }
//			return values.get(values.size()-index);
//	}
  /** find the 2°n to the last value
   * the algorithm is to make 2 nodes that they will start from the head
   * then will move the pointer (n2) which is going to be the last far from the first n1 with the same distance of nth
   * then push each of the n1,n2 one step till n2 reach the tail.
   * so we will have 2 loops as follow
   *
   * **/
		public Node findNthToTheLast(LinkedList list , int nth){
				Node n1 = new Node();
				Node n2 = new Node();
				n2=list.head;
				n1=list.head;
				for(int i=0;i<nth;i++){
					if (n2==null){return null;}
					n2=n2.getNext();
				}
				while(n2!=null){
					n1=n1.getNext();
					n2=n2.getNext();
				}
				return n1;
		}
		public LinkedList partition(LinkedList list , int value){
			Node current = new Node();
			current = list.head;
			list.tail=list.head;
			while(current!=null){
				Node next = current.getNext();
				if(current.getValue()< value){
					current.setNext(list.head);
				}else{
					list.tail.setNext(current);
					list.tail=current;
				}
				current = next;
			}
			list.tail.setNext(null);
			return list;
		}
		//TODO the rest of the exercises of the course (sums and intersection)
}

