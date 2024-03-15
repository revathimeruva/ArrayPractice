package com.kodnest.java;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] a= {2,4,9,3,7,6};
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {				//for largest:
				smallest=a[i];				//if(a[i]>largest){
			}
		}
		System.out.println(smallest);
	}

}
*/
		int[] a= {2,5,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
		}
			System.out.println();
		}
	}
	}
}
	