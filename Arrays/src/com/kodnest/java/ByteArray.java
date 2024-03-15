package com.kodnest.java;

import java.util.Scanner;

public class ByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User!please enter the size of an Array");
		Scanner scan=new Scanner(System.in);
		byte size=scan.nextByte();
		byte[] a=new byte[size];
		System.out.println("User!plz enter "+size+" elements");
		for(int i=0;i<=size-1;i++) {
			a[i]=scan.nextByte();
		}
		System.out.println("The elements are:");
		for(int i=0;i<=size-1;i++) {
			System.out.println(a[i]);
		}

	}

}

