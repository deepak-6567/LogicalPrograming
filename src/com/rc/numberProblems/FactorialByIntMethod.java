package com.rc.numberProblems;
import java.util.*;
public class FactorialByIntMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int res=getFactor(i);
			System.out.println(res);
		}
	}
	
	public static int getFactor(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	

}
