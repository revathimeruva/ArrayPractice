package com.kodnest.java;
import java.util.Scanner;
public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		int a[]= {10,20,30,40,50};
		int k=3;
		int temp[]=new int[(a.length)];
		for(int i=0;i<a.length;i++) {
			//temp[(i+k)%5]=a[i];
		temp[(i+k+1)%5]=a[i];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]+" ");
		}
	}
}
