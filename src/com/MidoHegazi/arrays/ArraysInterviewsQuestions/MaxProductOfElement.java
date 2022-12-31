package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

public class MaxProductOfElement {
	/**In this class we have to find the max product of two elements in one array **/

	public static void main (String []args){
		int [] numbers = {20,30,40,50};

		String pair= maxProduct(numbers);
		System.out.println(pair );

	}
	public static String maxProduct(int [] array){
		System.out.println("************ Benvenuto nel MaxProduct ************");
		int maxProduct=0;
		String pairOfElements="";
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]*array[j]>maxProduct){
					pairOfElements = Integer.toString(array[i])+","+Integer.toString(array[j]);
				}
			}
		}
		return pairOfElements;
	}

}
