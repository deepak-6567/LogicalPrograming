package com.rc.numberProblems;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int rev=0;
		int original=n;
		while(n>0) {
			int num=n%10;
			rev=rev*10+num;
			n=n/10;
		}
		//System.out.println(rev);
		if(rev==original) {
			System.out.println("It is a palindrome Number");
		}
		else {
			System.out.println("not a Palindrome number");
		}
	}

}
