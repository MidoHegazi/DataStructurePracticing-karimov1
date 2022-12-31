package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.Arrays;
import java.util.Collections;

public class FindDuplicateNumbersInArray {
	/** here we have to remove the duplicate numbers in array
	 * **/
	public static void main (String [] args){
		int [] nums = {1,2,3,4,3,2,5,9};
		findDuplicated(nums);

	}
	public static void findDuplicated(int [] array){
		int [] copyArray = Arrays.copyOfRange(array,0,array.length);
		System.out.println(" compy array = "+ Arrays.toString(copyArray));

		for(int i = 0; i < copyArray.length; i++){
			for(int j=i+1; j< copyArray.length; j++){
				if(copyArray[i]==copyArray[j]){
					System.out.print("Removing ...."+copyArray[j]);
					copyArray[j]=0;
				}
			}
		}
		Arrays.sort(copyArray);
		System.out.println("Sorted copy array after removing duplicated numbers  "+ Arrays.toString(copyArray));
	}

	private static int removeDuplicates(int a[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {

			if (a[i] != a[i + 1]) {

				a[j++] = a[i];

			}

		}

		a[j++] = a[n - 1];

		return j;

	}



	public static int[] removeDuplicates(int[] arr) {

		int result = removeDuplicates(arr, arr.length);

		int[] newArray = new int[result];

		for (int i = 0; i < result; i++) {

			newArray[i] = arr[i];

		}

		return newArray;

	}
}
