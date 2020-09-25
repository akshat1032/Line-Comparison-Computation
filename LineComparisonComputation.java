package com.capgemini.linecomparisoncomputation;

public class LineComparisonComputation {

	public static void main(String[] args) {
		
		//Variable
		double lengthLineOne = 0;
		double lengthLineTwo = 0;
		String lineOneLength = "";
		String lineTwoLength = "";
		
		//Co-ordinates of Line 1
		//Assuming the coordinates to be less than 100
		int lineOneX1 = (int)(Math.floor(Math.random() * 100));
		int lineOneY1 = (int)(Math.floor(Math.random() * 100));
		int lineOneX2 = (int)(Math.floor(Math.random() * 100));
		int lineOneY2 = (int)(Math.floor(Math.random() * 100));
		
		//Co-ordinates of Line 2
		//Assuming the coordinates to be less than 100
		int lineTwoX1 = (int)(Math.floor(Math.random() * 100));
		int lineTwoY1 = (int)(Math.floor(Math.random() * 100));
		int lineTwoX2 = (int)(Math.floor(Math.random() * 100));
		int lineTwoY2 = (int)(Math.floor(Math.random() * 100));
		
		//Printing Co-ordinates of two lines
		System.out.println("Co-ordinates of Line One (x1,y1) (x2,y2)  : "+"("+lineOneX1+","+lineOneY1+")"+" "+"("+lineOneX2+","+lineOneY2+")");
		System.out.println("Co-ordinates of Line Two (x1,y1) (x2,y2)  : "+"("+lineTwoX1+","+lineTwoY1+")"+" "+"("+lineTwoX2+","+lineTwoY2+")");
		
		//Calculating length of the line and storing as String 
		lengthLineOne = Math.sqrt((Math.pow(lineOneX2-lineOneX1, 2)+Math.pow(lineOneY2-lineOneY1, 2)));
		lengthLineTwo =  Math.sqrt((Math.pow(lineTwoX2-lineTwoX1, 2)+Math.pow(lineTwoY2-lineTwoY1, 2)));
		lineOneLength = String.valueOf(lengthLineOne);
		lineTwoLength = String.valueOf(lengthLineTwo);
		
		//Comparing the length of two lines
		if (lineOneLength.equals(lineTwoLength)) {
			System.out.println("The two lines are equal in length");
		}
		else {
			System.out.println("The two lines are not equal in length");
		}
	}
}
