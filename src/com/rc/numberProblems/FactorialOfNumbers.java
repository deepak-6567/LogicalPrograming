package com.rc.numberProblems;
import java.util.*;
public class FactorialOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int n=sc.nextInt();
		getFactor(n);
		
		
		
	}
	public static void getFactor(int n) {
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact*=j;
			}
			System.out.println(fact);
		}
	
	}

}
