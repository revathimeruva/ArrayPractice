package com.kodnest.java;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.println("the lenth is");
		int length=scan.nextInt();*/
		// TODO Auto-generated method stub
		int[] a= {10,17,40,14,80};
		/*for(int i=0;i<=length-1;i++) {
			if(a[i]==14) {
				System.out.println("element present");
				break;
		}
			else {
				System.out.println("not present");
			}
			System.out.println();
		}

	}

}*/
	int ele=14;
	boolean flag=true;
	for(int i=0;i<=a.length-1;i++) {
	if(ele==a[i]) {
		flag=true;
		break;
	}
	else {
		flag=false;
	}
	}
	if(flag==true) {
		System.out.println("element present");
	}
	else {
		System.out.println("not present");
	}
	}
}
