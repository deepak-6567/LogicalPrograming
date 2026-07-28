package com.rc.numberProblems;
import java.util.*;
public class TableByMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the number");
		printTable(num);
		
	}
	
	public static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
