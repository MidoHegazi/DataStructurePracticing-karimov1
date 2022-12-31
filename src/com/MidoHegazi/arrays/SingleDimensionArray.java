package com.MidoHegazi.arrays;

/**
 * so in this class we are going to work with the Arrays data structure.
 * we have to know that an array is a data structure of collection of values of a fixed number and same datatype
 * can have 3 phases of work the first is declaration -> ex. public int [] numbers;
 *                           the second is istantiation-> ex  = new int [5]  "5" is the legnth or the number of values inside
 *                           the third is initializzation -> ex numbers [0] = 3
 * an array index starts from 0
 *
 */

public class SingleDimensionArray {

public int [] numbers;

public SingleDimensionArray(int arrayLegnth){
	this.numbers = new int[arrayLegnth];
	for (int i=0;i<numbers.length;i++){
		numbers[i] = Integer.MIN_VALUE;
	}
}

	public static void main (String [] args){
	SingleDimensionArray sarray = new SingleDimensionArray(4);

	}

	public  void insertInArray (int location , int value){
		try {
			if (numbers[location] == Integer.MIN_VALUE) {
				numbers[location]=value;
				System.out.println("the value has been successfully inserted :)");
			}
			else{
				System.out.println("this index is already occupied !!");

			}
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("this location is out of boundaries");
		}
		}

		// now a method to traversal array -> which will access all the indexes in an array
	public void traversalArray (){
	 try {
		 for (int number : numbers) {
			 System.out.print(number + "");
		 }
	 }catch (IndexOutOfBoundsException e){
		System.out.println(" no array is istantiated yet ");
	}
	}

	// a method that searches certain value in array
	public void searchNum(int num){
	 for (int i = 0 ; i<numbers.length;i++){
		 if ( numbers[i] == num){
			System.out.println(" the number searched is found has index of "+i );
			 return;
		 }
		}
		System.out.println(" Not found value!!!");
	}
	/** Pay attention when it comes to delete a given cell in an array.
	 * we cann't delete any given cell in an array we can only reset the cell to a default value
	 * **/
	public void deleteNum (int valueToDeleteIndex){
		try{
			numbers[valueToDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("the index has been resetted correctly and the current value is : "+ numbers[valueToDeleteIndex]);
		}catch (IndexOutOfBoundsException e){
			System.out.println("the inserted value is out of the array range");
		}
	}
}




