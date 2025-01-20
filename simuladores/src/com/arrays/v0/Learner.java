package com.arrays.v0;

public class Learner {
	public static void main(String[] args) {
		String[] dataArr = new String[4];
		//dataArr[0] = "Patrobas";
		dataArr[1] = "Bill";
		dataArr[2] = ""; 
		dataArr[3] = "Larry";
		try {
			for (String data : dataArr) {
				System.out.print(data + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		System.out.println("Fin de Programa");
	}
}
