package com.MidoHegazi.linkedLists.crackingquestionslinkedlists;

public class app {
	public static void main (String []args){
		LinkedList list = new LinkedList();
		list.createLL(1);
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.traversalLL();
		System.out.println("*** now we will remove the Dups");
		QuestionPractice question = new QuestionPractice();
		question.removeDups(list);
		list.traversalLL();
		System.out.println("\n"+ "the nth value of last node .....");
		System.out.println(question.findNthToTheLast(list,3).getValue());
	}

}
