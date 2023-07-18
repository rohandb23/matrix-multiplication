package com.aurionpro.model;

public class MatricMultiplication {

	public static void main(String[] args) {
		
		int[][] arrayOne = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] arraytwo = {{1,2,3},{1,2,3},{1,2,3}};
		int rows1 = arrayOne.length;
		int column1 = arrayOne[0].length;
		int rows2 = arraytwo.length;
		int column2 = arraytwo[0].length;
		int[][] finalArray = new int[arrayOne.length][arraytwo.length];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < column2; j++) {
				int temp =0;
				for (int k = 0; k < column1; k++) {
					temp = temp+arrayOne[i][k]*arraytwo[k][j];
				}
				finalArray[i][j]=temp;
			}
		}
		for (int i = 0; i < finalArray.length; i++) {
			for (int j = 0; j < finalArray.length; j++) {
				System.out.print(finalArray[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
