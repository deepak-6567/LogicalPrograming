package com.rc.numberProblems;
import java.util.*;
public class Duck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int n=sc.nextInt();
		
	}
	public static int get(int n) {
		while(n>0) {
			int d=n%10;
			if(d==0)
				return 1;
			
			n=n/10;
		}
		return 0;
		
	}

}
