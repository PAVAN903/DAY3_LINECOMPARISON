package com.bridgelab;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("welcome to line comparison program");
		double lengthofLine;
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
	}

}
