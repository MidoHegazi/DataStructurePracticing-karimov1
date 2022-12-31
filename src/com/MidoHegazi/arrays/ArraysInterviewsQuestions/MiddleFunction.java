package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.Arrays;

public class MiddleFunction {
	/**
	 * in this exercise we will make a method which will take an array and return back an array with the middle elements
	 * without the first and the last
	 * **/
	public static void main (String [] args){
		int [] nums={1,2,3,4,5};
		System.out.println(Arrays.toString(middle(nums)));
		System.out.println(Arrays.toString(middleCopyOfRange(nums)));

	}
	public static int[] middle(int [] array){
		int [] middleArray= new int[array.length-2];
		if (array.length!=0){
			  int i=0;
				for(int j=0;j<middleArray.length;j++){
					middleArray[j]=array[i+1];
					i++;
					System.out.println(middleArray[j]);
				}
			return middleArray;
			}
		return null;
		}

		public static int [] middleCopyOfRange(int [] array){
		if ( array.length != 0 ){
			int[] middleArray = Arrays.copyOfRange(array,1,array.length-1);
			return middleArray;
		}
		return null;
		}

	}

