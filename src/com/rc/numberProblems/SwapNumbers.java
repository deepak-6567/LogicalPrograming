package com.rc.numberProblems;
import java.util.*;
public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :");
		int b=sc.nextInt();
		
		//a=a+b;
		int temp=a;
		a=b;
		b=temp;
		//b=a-b;
		//a=a-b;
		System.out.println("a ="+ a);
		System.out.println("b ="+b);
		
	}

}
