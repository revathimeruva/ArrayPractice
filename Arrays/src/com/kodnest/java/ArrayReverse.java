package com.kodnest.java;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		char ch[]= new char[n];
		int k=3;
		int temp[]=new int[(ch.length)];
		for(int i=0;i<ch.length;i++) {
			//temp[(i+k)%5]=a[i];
		//temp[(i+k+1)%5]=a[i];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]+" ");
		}
	}

}
