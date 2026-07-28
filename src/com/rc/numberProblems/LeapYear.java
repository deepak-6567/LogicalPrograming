package com.rc.numberProblems;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();
		//System.out.println(check(n));
		if(check(n)==1) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		
	}
	public static int check(int n) {
		if((n%4==0 && n%100!=0 )||( n%400==0)) 
			return 1;
		else {
			return 0;
		}
	}

}
