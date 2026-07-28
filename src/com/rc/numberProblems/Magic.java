package com.rc.numberProblems;
import java.util.*;
public class Magic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting Number");
		int start=sc.nextInt();
		System.out.println("Enter the ending range");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
			if(check(i)==1) {
				System.out.println(i);
			}
		}
	}
	
	public static int get(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n=n/10;
		}
		return sum;
	}
	public static int check(int n) {
		int res=get(n);
		while(n>9) {
			res=get(res);
		}
		return res;
	}

}
