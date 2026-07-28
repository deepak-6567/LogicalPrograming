package com.rc.numberProblems;
import java.util.*;
public class TablesWithinN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		getTable(n);
		
	}
	public static void getTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("Table of " + i);
			
			for(int j=1;j<=10;j++) {
				  System.out.println(i + " x " + j + " = " + (i * j));
			}
		    System.out.println();
		}
		
	}

}
