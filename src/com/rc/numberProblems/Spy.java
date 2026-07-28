package com.rc.numberProblems;
import java.util.*;
public class Spy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(sum(n)==product(n)) {
			System.out.println("it is");
		}
		else {
			System.out.println("not");
		}
	}
	public static int sum(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n=n/10;
		}
		return sum;
	}
	
	public static int product(int n) {
		int pro=1;
		while(n>0) {
			int d=n%10;
			pro*=d;
			n=n/10;
		}
		return pro;
	}

}
