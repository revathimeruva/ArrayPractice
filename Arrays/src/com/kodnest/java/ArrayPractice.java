package com.kodnest.java;
import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n=scan.nextInt();
		int[] createArray=createArray(n);
		System.out.println("The array elements are:");
		for(int i=0;i<createArray.length;i++) {
			System.out.println(createArray[i]);
		}
		//reverse of an array
		displayreverse(createArray);
	}
	static void displayreverse(int[] a) {
		System.out.println("The elements in reverse order:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	//display elements in reverse order
	//replace the positive elements with equivalent negative values
	//find the smallest element
	//find the largest element
	//
	static int[] createArray(int n) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		return a;
	}

}
