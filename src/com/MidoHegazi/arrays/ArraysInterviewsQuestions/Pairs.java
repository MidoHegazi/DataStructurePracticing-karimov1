package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

public class Pairs {
	/**in this exercise we have to find the pairs of values inside an array of object that form a Given value **/
	public static int [] numbers ={10,2,3,4,5};

	public static void main (String [] args){
  findPairs(numbers,15);
	}
	public static void findPairs(int [] array,int value){
		// so in this method we need to know which pairs of values form the value parameter
		// so we need to loop inside the array by the first element , then loop again inside the element starting from the
		// next element to see if the sum can be the given value.
		for (int i=0;i<array.length;i++){
			for (int j=1;i<array.length;j++){
				if( array[i]+array[j] == value ){
					System.out.println("The pair of value that forms "+ value + " are :" + "[" + array[i] +","+ array[j] + "]");
					return;

				}
			}
		}
		throw new IllegalArgumentException("No solution found");
	}
}
// TODO -> ask Francesco why it gives me ArrayIndexOutOfBoundsException instead of IllegalArgumentException
