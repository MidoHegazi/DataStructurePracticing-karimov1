package com.MidoHegazi.arrays.ArraysInterviewsQuestions;



public class FindTheMissingNumber {
	/**
	 * int this class we have an array of int from 1 to n  and we have to find the missing number in the array
	 *
	 * **/
	public static void main (String []args){
   int [] nums={1,2,3,4,6};
		findMissing(nums,6);
	}



	public static void findMissing(int [] array,int n){
		int sumArray =0;
		int sumFormula=0;
		for(int i:array){
			sumArray+=i;
		}
		sumFormula = n*(n+1)/2; /** here we can use also a for loop **/
		System.out.println("the missing number is : "+ (sumFormula-sumArray));
	}
}
