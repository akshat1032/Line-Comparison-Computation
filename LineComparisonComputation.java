package com.capgemini.linecomparisoncomputation;

public class LineComparisonComputation {

	public static void main(String[] args) {
		
		//Variable
		double lengthLineOne = 0;
		
		//Co-ordinates of Line 1
		int lineOneX1 = (int)(Math.floor(Math.random() * 10));
		int lineOneY1 = (int)(Math.floor(Math.random() * 10));
		int lineOneX2 = (int)(Math.floor(Math.random() * 10));
		int lineOneY2 = (int)(Math.floor(Math.random() * 10));
		
		//Printing Co-ordinates
		System.out.println("Co-ordinates of Line One (x1,y1) (x2,y2)  : "+"("+lineOneX1+","+lineOneY1+")"+" "+"("+lineOneX2+","+lineOneY2+")");
		
		//Calculating length of the line
		lengthLineOne = Math.sqrt((Math.pow(lineOneX2-lineOneX1, 2)+Math.pow(lineOneY2-lineOneY1, 2)));
		
		//Printing length of the line
		System.out.println("Length of Line One : "+lengthLineOne);
	}
}
