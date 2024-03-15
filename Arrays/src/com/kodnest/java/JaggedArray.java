package com.kodnest.java;
/*
public class JaggedArray {

	public static void main(String[] args) {*/
		// TODO Auto-generated method stub
	/*	int[][][] a=new int[2][][];
					a[0]=new int[2][];
					a[0][0]=new int[3];
					a[0][1]=new int[2];
					a[1]=new int[1][];
					a[1][0]=new int[2];
			//	System.out.println(a[i][j][k]);
					for(int i=0;i<a.length;i++) {
						for(int j=0;j<a[i].length;j++) {
//					System.out.println(a[0][1]);
//					System.out.println(a[1][0]);
							System.out.println(a[i][j]);


				}
			}
		}

		
	}
*/
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][]c=new int[2][2];
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a[i].length;j++) {
				/*c[0][0]=a[0][0]+b[0][0];
				c[0][1]=a[0][1]+b[0][1];
				c[1][0]=a[1][0]+b[1][0];
				c[1][1]=a[1][1]+b[1][1];
				*/
				a[i][j]=scan.nextInt();
				b[i][j]=scan.nextInt();
				System.out.println("the elements are:");
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}
			}
		}