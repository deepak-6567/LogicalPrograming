package com.rc.numberProblems;
import java.util.*;
public class FactorialByMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int fact=getFactor(n);
		System.out.println(fact);
		
	}
	public static int getFactor(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

}
