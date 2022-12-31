package com.MidoHegazi.arrays.ArraysInterviewsQuestions;

import java.util.Arrays;

public class RotateArray90Degree {
	/**
	 * in this Class we have a 2D array that like the following and we want to rotate it a 90° degree clockwise
	 *          1   2   3               1   4   7
	 *          4   5   6      ->       2   5   8
	 *          7   8   9               3   6   9
	 *
	 *          to solve that we need :
	 *          1- to transpose it in order that the first row become the last column
	 *
	 *          7   4   1
	 *          8   5   2
	 *          9   6   3
	 *
	 *          2- to reorder it like the following
	 *
	 *          1   4   7
	 *          2   5   8
	 *          3   6   9
	 *
	 *
	 * **/
	public static void main (String []args){
   int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
	 int [][] rotated = rotate(array);
	 System.out.println(Arrays.deepToString(rotated));
	}
	public static int[][] rotate(int [][] array){
		for (int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if( i != j ){
					int temp=array[i][j];
					array[i][j]=array[j][i];
					array[j][i]=temp;
				}
			}
		}
		for(int row=0;row< array.length;row++){
			for(int col=0;col<(array.length)/2;col++){
				int temp = array[row][col];
				array[row][col]=array[row][array[row].length-col-1];
				array[row][array[row].length-col-1]=temp;
			}
		}
		return array;
	}
}
