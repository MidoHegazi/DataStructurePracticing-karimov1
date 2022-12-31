package com.MidoHegazi;

import com.MidoHegazi.arrays.SingleDimensionArray;

import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    /** we are trying to measure the recursione with big O notation**/
    // ex- we have an array of numbers and we want to find the biggest number in the array
    public static int[] numbers = {11,12,3,35};

    public static void main(String[] args) {
        System.out.println(findMaxNumber(numbers,4));

        SingleDimensionArray sarray = new SingleDimensionArray(4);
        sarray.insertInArray(0,3);
        sarray.insertInArray(1,2);
        sarray.insertInArray(0,5);
        sarray.insertInArray(10,3);

        sarray.traversalArray();
        System.out.println("***searching a value with number \n Please enter a number to search ....");
        Scanner input = new Scanner(System.in);
        sarray.searchNum(input.nextInt());
        System.out.println("the delete method is active");
        sarray.deleteNum(7);


    }
    // here we are going to implement a method that will take the arrays and it's legnth as parameters
    public static int findMaxNumber(int[] sample,int n) {
        if (n == 1) {
            return sample[0];
        }
        return max(sample[n-1],findMaxNumber(sample,n-1));
    }
}
