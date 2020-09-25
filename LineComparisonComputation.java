package com.capgemini.linecomparisoncomputation;

public class LineComparisonComputation {
	
	//Constants
	//Co-ordinates of Line 1
	//Assuming the coordinates to be less than 100
	public static final int LINE_ONE_X1 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_ONE_Y1 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_ONE_X2 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_ONE_Y2 = (int)(Math.floor(Math.random() * 100));
			
	//Co-ordinates of Line 2
	//Assuming the coordinates to be less than 100
	public static final int LINE_TWO_X1 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_TWO_Y1 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_TWO_X2 = (int)(Math.floor(Math.random() * 100));
	public static final int LINE_TWO_Y2 = (int)(Math.floor(Math.random() * 100));
	
	//Variable
	private double lengthLineOne = 0;
	private double lengthLineTwo = 0;
	private String lineOneLength = "";
	private String lineTwoLength = "";
	private int compareToValue = 0;
	
	//Calculating length of line and storing in String
	public void calculateLength() {
		
		this.lengthLineOne = Math.sqrt((Math.pow(LINE_ONE_X2-LINE_ONE_X1, 2)+Math.pow(LINE_ONE_Y2-LINE_ONE_Y1, 2)));
		this.lengthLineTwo = Math.sqrt((Math.pow(LINE_TWO_X2-LINE_TWO_X1, 2)+Math.pow(LINE_TWO_Y2-LINE_TWO_Y1, 2)));
		this.lineOneLength = String.valueOf(lengthLineOne);
		this.lineTwoLength = String.valueOf(lengthLineTwo);
	}
	
	//Comparing using equals
	public boolean compareUsingEquals() {
		return (this.lineOneLength.equals(this.lineTwoLength));
	}
	
	//Comparing using compareTo
	public int compareUsingCompareTo() {
		
		this.compareToValue = this.lineOneLength.compareTo(this.lineTwoLength);
		return this.compareToValue;
	}
	
	//Printing
	public void printComparisonMessage() {
		boolean lengthCheckEquals = this.compareUsingEquals();
		double lengthCheckCompareTo = this.compareUsingCompareTo();
		if (lengthCheckEquals && lengthCheckCompareTo == 0) {
			System.out.println("The two lines are equal in length");
		}
		else if (lengthCheckCompareTo > 0) {
			System.out.println("Line One is longer than Line Two");
		}
		else {
			System.out.println("Line Two is longer than Line One");
		}
		
	}
	
	public static void main(String[] args) {
		
		LineComparisonComputation lengthObject = new LineComparisonComputation();
		
		lengthObject.calculateLength();

		//Printing Co-ordinates of two lines
		System.out.println("Co-ordinates of Line One (x1,y1) (x2,y2)  : "+"("+LINE_ONE_X1+","+LINE_ONE_Y1+")"+" "+"("+LINE_ONE_X2+","+LINE_ONE_Y2+")");
		System.out.println("Co-ordinates of Line Two (x1,y1) (x2,y2)  : "+"("+LINE_TWO_X1+","+LINE_TWO_Y1+")"+" "+"("+LINE_TWO_X2+","+LINE_TWO_Y2+")");
		lengthObject.printComparisonMessage();
	}
}
