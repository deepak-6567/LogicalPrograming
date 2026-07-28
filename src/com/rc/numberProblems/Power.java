package com.rc.numberProblems;
import java.util.*;
public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int pow=sc.nextInt();
		System.out.println(getPower(num,pow));
		
	}
	public static int getPower(int num,int powe) {
		int pow=1;
		for(int i=1;i<=powe;i++) {
			pow*=num;
		}
		return pow;
		
	}

}
