package com.rc.numberProblems;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();

		if(getNumber(n)==1) {
			System.out.println("it is armstrong NUmber");
		}
		else {
			System.out.println("not armstrong Number");
		}
		
	}
	public static int getNumber(int n) {
		int temp=n;
		int res=n;
		int count=0;
		int sum=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		while(temp>0) {
			int d=temp%10;
			sum+=getPower(d,count);
			temp=temp/10;
		}
		if(sum==res)
			return 1;
		else
			return 0;
	}
		
		public static int getPower(int n,int a){
			int pow=1;
			for(int i=0;i<a;i++) {
			pow*=n;
			}
			return pow;
			
		}
}
