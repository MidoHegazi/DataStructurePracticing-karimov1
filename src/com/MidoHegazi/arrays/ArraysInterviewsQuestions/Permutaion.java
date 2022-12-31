package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

public class Permutaion {
	/**
	 * In this exercise we are going to check if two arrays has the same elements or not if yest we return true if not
	 * **/
	public static void main (String [] args){
		int [] nums1 = {1,2,3,4,5};
		int [] nums2 = {2,1,3,5,4};
		int [] nums3 = {1,2,3,5,6};
		boolean isPermutationResult = isPermutation(nums1,nums2);
		System.out.println(isPermutationResult);
	}
	public static boolean isPermutation( int [] array1 , int [] array2 ){
		int permutation=0;
		for(int i = 0 ; i<array1.length;i++){
			for(int j = 0;j<array2.length;j++){
				if( array1[i]== array2[j]){
					permutation++;
					System.out.println( "[" + array1[i]+ "," + array2[j] + "]" + permutation );
				}
			}
		}
		if(permutation == array1.length){
			return true;
		}
		return false;
	}
}
