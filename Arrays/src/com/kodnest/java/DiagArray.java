package com.kodnest.java;
import java.util.Scanner;
public class DiagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner scan=new Scanner(System.in);
		int[][] a=new int[3][3];
		//a[3][3]=scan.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
				System.out.println(a[i][j]);
				}
			}
		}
	}

}
*/
		
		//PRINTING the BORDER ELEMENTS
		int[][] a={{4,7,8},{9,7,6},{3,1,2}};
		int n=a.length;
		//int i=0;
		for(int j=0;j<n;j++) {
			System.out.println(a[0][j]);
		}
		int j=n-1;
		for(int i1=1;i1<n;i1++) {
			System.out.println(a[i1][n-1]);
		}
		//i=j;
		for(int j1=1;j1>=0;j1--) {
			System.out.println(a[n-1][j1]);
		}
		//j=0;
		for(int i1=1;i1>0;i1--) {
			System.out.println(a[i1][0]);
		}
	}
		}