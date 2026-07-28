package com.rc.numberProblems;

import java.util.Scanner;

public class PalindromeUserRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting Range");
		int start=sc.nextInt();
		System.out.println("Enter the ending Range");
		int end=sc.nextInt();
	 
			for(int i=start;i<=end;i++) {
				int rev=0;
				int original=i;
				int num=i;
				
			
				while(num>0) {
					int rem=num%10;
				    rev=rev*10+rem;
				    num=num/10;
				}
			if(rev==original) {
				System.out.println(i);
				
			}
			}
	
	}

}
