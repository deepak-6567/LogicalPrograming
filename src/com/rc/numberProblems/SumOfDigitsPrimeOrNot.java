package com.rc.numberProblems;

import java.util.Scanner;

public class SumOfDigitsPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
	for(int i=2;i<=sum/2;i++) {
		if(sum%i==0) 
		count++;
		
	}
	if(count==0) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	}

}
