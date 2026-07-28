package com.rc.numberProblems;
import java.util.*;
public class BuzzNumbre {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(check(n)==1) {
			System.out.println("it is");
		}
		
	}
	public static int check(int n) {
		if(n%7==0 || n%10==7)
			return 1;
		
			return 0;
		
	}

}
