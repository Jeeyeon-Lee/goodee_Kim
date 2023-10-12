package com.step5;

public class TwoArray {

	public static void main(String[] args) {
		//int is[][] = new int[2][3];
		int is[][] = {{1,2,3},{4,5,6}};
		is = new int[][] {{11,12,13},{14,15,16}};
		
		//is[0] = new int[3];
		//is[1] = new int[3];
		for(int x=0;x<is.length;x++) {//is.length = 2
			for(int y=0;y<is[x].length;y++) {
				System.out.println("is["+x+"]["+y+"] = "+is[x][y]);
			}
		}
	}

}
