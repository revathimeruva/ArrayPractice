package com.kodnest.java;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("User plz enter the rows");
		int row=scan.nextInt();
		System.out.println("user plz enter the columns");
		int col=scan.nextInt();
		int a[][]=new int[row][col];
		
		//display the matrix elements
		System.out.println("original matrix: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
				//System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//create transpose matrix
		int t[][];
		if(row==col) {
			t=new int[row][col];
		}else {
			t=new int[row][col];
		}
		//transpose logic
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				t[i][j]=a[j][i];
			}
		}
		//displaying transpose matrix
		System.out.println("Transpose matrix: ");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(t[i][j]+" ");
				}
				System.out.println();
		}
	}

}
