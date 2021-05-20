package com.bridgelab;

import java.util.*;
import java.lang.Math;

class Line{
    Scanner t=new Scanner(System.in);
//	    System.out.println("Endpoints of Line 1");
	    int x1=t.nextInt();
	    int y1=t.nextInt();
	    int x2=t.nextInt();
	    int y2=t.nextInt();
	    double length1 =((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//	    System.out.println("Endpoints of Line 2");
	    int X1=t.nextInt();
	    int Y1=t.nextInt();
	    int X2=t.nextInt();
	    int Y2=t.nextInt();
	    double length2 =((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
	    double s1=Math.sqrt(length1);
	    double s2=Math.sqrt(length2);
	    public void comparison(){
	        System.out.println(s1==s2);
	        if (s1>s2){
	        System.out.println("line 1 Is greater than line 2");
	    } 
	    else if (s1<s2){
	        System.out.println("line 2 Is greater than line 1");
	    } 
	    else{
	        System.out.println("line 2 Is equal to line 1");
	    }
	    }
}
public class LineComparisionProblem
{
	public static void main (String[] args) {
		System.out.println("Welcome To The Line Computation Problem");
		Line line= new Line();
		line.comparison();
	}
}