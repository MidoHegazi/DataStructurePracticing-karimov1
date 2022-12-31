package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.Scanner;

public class FindNumberInArray {

	public static int [] numbers= {1,2,3,4,5,6};
	public static void main (String [] args){
		findNumber(numbers);

	}
	public static void findNumber(int [] numbers){
		System.out.println("Please insert the number that you want to search for");
		Scanner input = new Scanner(System.in);
		int valueToFind = input.nextInt();

		for (int i=0;i<numbers.length;i++){
			if(numbers[i]==valueToFind){
				System.out.println("the value has been found and at the index of : " + i);
				return;
			}

		}
		System.out.println("We are sorry but the value is not matching with any element");
	}

}
