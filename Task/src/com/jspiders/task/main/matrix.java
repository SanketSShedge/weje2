package com.jspiders.task.main;

public class matrix {

		public static void main(String[] args) {
			int arr1[][] = {{1,1,1},{2,2,2},{3,3,3}};
			int arr2[][] = {{1,1,1},{2,2,2},{3,3,3}};
			int sum[][] = new int[3][3];
			
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<arr2.length; j++) {
					sum[i][j] = 0;
					for(int k=0; k<sum.length; k++) {
						sum[i][j] += arr1[i][k]*arr2[k][j];
					}
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();
			}
		}
}
