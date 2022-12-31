package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

public class IsUnique {
	/*** in this exercise we have to check if the array is unique or has repetition in elements **/
	public static void main (String [] args ){
		int [] numbers = {1,2,3,4,5};
		isUnique(numbers);

	}
	public static void isUnique(int [] array){
		System.out.println("************* Stiamo verificando L'unicità dell'array *************");
		int value=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					System.out.println(" the array is not unique value of : "+array[j]+" has been repeated at index of "+ i +" and "+j);
          return;
				}
			}
		}
		System.out.println("the array is unique");
	}
}
