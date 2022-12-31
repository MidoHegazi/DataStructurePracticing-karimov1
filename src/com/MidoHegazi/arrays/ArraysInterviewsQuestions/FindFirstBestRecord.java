package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.Arrays;
import java.util.Collections;

public class FindFirstBestRecord {
	/**
	 * in this excercise try to find the biggest record and the second best record in array
	 * ex: int [] numbs= {39,30,40,330,25,10,1000};
	 * **/
	public static void main (String []args){
		Integer [] numbs = {39,30,40,330,25,10,1000};
		// solution with the sort Method
		findFirstSecondBestRecordSorting(numbs);

		// solution without the sorting method
		Arrays.sort(numbs, Collections.reverseOrder());
		System.out.println(Arrays.toString(numbs));
		findFirstSecondBest(numbs);

	}


	// this solution i have found it without using the sorting method Arrays.sort()
	public static void findFirstSecondBest(Integer[] array){
		int firstRecord=0;
		int secondRecord=0;
		for(int i = 0 ; i < array.length; i++){
			for(int j= i+1; j < array.length; j++){
				firstRecord=Math.max(firstRecord,Math.max(array[i] ,array[j]));
				System.out.println(firstRecord);
			}
		}
		Integer[] secondArray = Arrays.copyOfRange(array,0,array.length);
		System.out.println("creating secondArray");
		System.out.println(Arrays.toString(secondArray));
		for(int y=0;y<secondArray.length;y++) {
			if (secondArray[y] == firstRecord) {
				secondArray[y] = 0;
			}
		}
		System.out.println(Arrays.toString(secondArray));
			for(int v=0;v<secondArray.length;v++){
				for(int w=v+1;w<secondArray.length;w++){
					secondRecord=Math.max( secondRecord , Math.max(secondArray[v],secondArray[w]) );
					System.out.println(secondRecord);
				}
			}

		System.out.println("first record = "+firstRecord+" | second record = "+ secondRecord);
	}
	// this solution using the method Arrays.sort()
	public static void findFirstSecondBestRecordSorting(Integer [] array){
		int firstRecord=0;
		int secondRecord=0;
		Integer [] sorted = Arrays.copyOfRange(array,0,array.length);
		Arrays.sort(sorted,Collections.reverseOrder());
		firstRecord= sorted[0];
		for(int i = 0; i < sorted.length; i++){
			if(sorted[i]!= firstRecord){
				secondRecord = sorted[i];
				break;
			}
		}
		System.out.println(" ** Sort Method  ** First best record = "+firstRecord+" | second best record = "+secondRecord);
	}

}
