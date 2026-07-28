package com.rc.numberProblems;
import java.util.*;
public class Geranium {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(get(n)==n) {
			System.out.println("it is");
		}
		else {
			System.out.println("not");
		}
	}
	public static int get(int n) {
		int count=0;
		int temp=n;
		while(n>0) {
			count++;
			n=n/10;
		}
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			sum=sum+power(d,count);
			count--;
			temp=temp/10;
		}
		return sum;
	}
	public static int power(int d,int count) {
		int res=1;
		while(count>0) {
			res=res*d;
			count--;
		}
		return res;
	}

}
