package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.stream.IntStream;

public class MissingNumberInArray {


	public static void main (String []args){
		int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		findMissingNumber(intArray,10);

	}
	public static void findMissingNumber(int [] intArray , int n){
	// as we know mathematical formula for summing numbers from 1 to n is S=n(n+1)/2
	// so if we sum the given array then subttract it from  the sum of the formula 	we can get the missing number
		// 1- we sum the sum of the given array
		int sumArray=0;
		int sumFormula=0;
		for(int i:intArray){
			sumArray+=i;
		}
	 //2- we sum the formula from 1-10
		sumFormula = n*(n+1)/2;
   //3- the missing number is the difference between the two sums
		System.out.println(" the missing number is : "+(sumFormula-sumArray));
	}
}
