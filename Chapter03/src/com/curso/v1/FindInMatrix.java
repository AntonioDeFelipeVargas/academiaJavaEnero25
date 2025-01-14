package com.curso.v1;

public class FindInMatrix {
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
		int searchValue = 99;
		
		int[] resultado = getCoordenadas(list,searchValue);
		
		int positionX = resultado[0];
		int positionY = resultado[1];
		
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

	}
	
	
	static int[] getCoordenadas(int[][] list, int searchValue){
		int positionX = -1;
		int positionY = -1;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					return new int[]{positionX,positionY};
				}
			}
		}
		return new int[]{positionX,positionY};
	}
}
