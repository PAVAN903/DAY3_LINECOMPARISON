package com.bridgelab;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("welcome to line comparison program");
		double lengthofLine;
		double lineoflength1,lineoflength2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter co ordinates of x1");
		int x1=sc.nextInt();
		System.out.println("enter co ordinates of xx2");
		int x2=sc.nextInt();
		System.out.println("enter co ordinates of y1");
		int y1=sc.nextInt();
		System.out.println("enter co ordinates of y2");
		int y2=sc.nextInt();
		 
        lengthofLine=(Math.sqrt(Math.pow(x2, x1))+Math.pow(y2, y1));
        System.out.println("Length of line is:: "+lengthofLine);
		
		System.out.println("enter line co ordinates x1,x2 and y1,y2");
		 lineoflength1 = getLength(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		 System.out.println("enter line co ordinates x1,x2 and y1,y2");
		 lineoflength2 = getLength(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("length of line 1:: "+lineoflength1);
		System.out.println("length of line 2:: "+lineoflength2);
		if(lineoflength1==lineoflength2) {
			System.out.println("both lines are equal");
			
		}else {
			System.out.println("both lines are not equal");
		}
	}

	 static double getLength(int x1, int x2, int y1, int y2) {
		
		return (Math.sqrt(Math.pow(x2, x1))+Math.pow(y2, y1));
	}

}
