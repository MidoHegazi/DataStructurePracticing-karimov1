package com.MidoHegazi.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * in this project we will make a program that takes the empretuare and calculate the average tempreture after
 * getting the tempretures value from the user;
 **/

public class ArraysTemperatureProject {
	public static void main (String []args){
		calculateTemperature();


	}

	public static void calculateTemperature(){
		System.out.println("***************************Welcome to the Temperature Program*****************************");
		System.out.println("Please insert the numbers of days : ");
		int [] tempretures = null;
		int tempreturesCount=0;
		int average=0;
		int daysOverAverage=0;
		Scanner input = new Scanner(System.in);
		int arrlength =input.nextInt();
		if ( arrlength > 0){
			 tempretures= new int[arrlength];
			for(int i=0;i<tempretures.length;i++){
				System.out.print(" please insert Day "+(i+1)+"° tempreture :");
				Scanner temp= new Scanner(System.in);
				tempretures[i]=temp.nextInt();
				tempreturesCount=tempreturesCount+tempretures[i];
				average = tempreturesCount/tempretures.length;
			}
			for(int x=0;x<tempretures.length;x++){
				if(tempretures[x]>average){
					daysOverAverage++;
				}
			}
			System.out.println("the average tempreture = "+ average +"\n"+daysOverAverage+" day(s) over average");
		}else{
			System.out.println("The days number should be greater than 0 ");
		}
	}
}
