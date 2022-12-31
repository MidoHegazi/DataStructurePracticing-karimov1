package com.MidoHegazi.arrays;

public class FindMaxNumberInArray {
	public static int [] numbers = {1,2,3,4};
	public static String string = "Mido";

	public static void main (String [] args) {
		System.out.println(findMax(numbers,4));
	}
	public static int findMax(int [] array,int n){
		if ( n==1 ){
			return array[0];
		}
		return Math.max(array[n-1],findMax(array,n-1));
	}

}
