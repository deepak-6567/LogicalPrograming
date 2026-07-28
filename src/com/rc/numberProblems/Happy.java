package com.rc.numberProblems;
import java.util.*;
public class Happy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		while(n!=1 && n!=4) {
			int sum=0;
			while(n>0) {
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
				
			}
			n=sum;
		}
	}

}
