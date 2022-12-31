package com.MidoHegazi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	 public  int [][] tdArray;

	public TwoDimensionalArray(int rowsNum , int columnsNum){
		this.tdArray= new int[rowsNum][columnsNum];
		for (int rows =0;rows<tdArray.length;rows++){
			for(int columns = 0; columns<tdArray[0].length;columns++){
				tdArray[rows][columns] = Integer.MIN_VALUE;
			}

		}
	}
}
class main {

	public static void main(String[] args) {

		TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 3);
		System.out.println(Arrays.deepToString(twoDimensionalArray.tdArray));
		System.out.println(" ***** inserting in two dimensional array Method *****************************************");
		insertValue(twoDimensionalArray.tdArray, 1, 1, 389149309);
		System.out.println("the array after inserting is : " + Arrays.deepToString(twoDimensionalArray.tdArray));
		System.out.println("***************************************************\naccessing a value :");
		accessingValue(twoDimensionalArray.tdArray,4,4);
		traversArray(twoDimensionalArray.tdArray);
		searchingValue(twoDimensionalArray.tdArray,38914930);
		deleteValue(twoDimensionalArray.tdArray,1,1);
	}

	// creating a method that inserts a value in a 2 dimensional array
	public static void insertValue(int[][] tdArray, int row, int column, int value) {
		try {
			if (tdArray[row][column] == Integer.MIN_VALUE) {
				tdArray[row][column] = value;
				System.out.println("the value has been inserted successfully");
			} else {
				System.out.println("the location inserted is already occupied");
			}

		} catch (IndexOutOfBoundsException e) {
			e.getMessage();
		}
	}

	public static void accessingValue(int [][] array, int row , int column ){
		try{
			System.out.println(array[row][column]);

		}catch (IndexOutOfBoundsException ex){
			System.out.println("the indexes inserted are out of the range");
		}

	}
	public static void  traversArray(int [][]array){
		System.out.println("*********** Traversing the array (printing each element)");
		for (int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void searchingValue(int [][] array, int value){
		System.out.println("******************************************************************\n Searching for value : "+value);
    try{
			for (int i=0;i<array.length;i++){
				for (int j=0;j<array[0].length;j++){
					if ( array[i][j] == value ){
						System.out.println("Wow -> the value is present at row :" +i+" and column : "+j );
						return;
					}
				}
			}
    }	catch (ArrayIndexOutOfBoundsException ex){
	    System.out.println("Rows or Columns are out of Range");
    }
		System.out.println("the inserted value has no place in this array");
	}

	// Deleting from Two dimensional Array
	public static void deleteValue(int [][] array , int row, int col){
		System.out.println("***************************************************************\n Deleting value Method is active");
		if(array[row][col]!= Integer.MIN_VALUE){
			try{
				array[row][col]=Integer.MIN_VALUE;
				System.out.println("the value of the index is deleted Successfully and the current value is "+array[row][col]);
			}catch (IndexOutOfBoundsException ex)
			{
				System.out.println("this index is out of range");
			};
		}else {
			System.out.println("Sorry there is no value to be delted since the current value is : "+array[row][col]);
		}
	}

}


