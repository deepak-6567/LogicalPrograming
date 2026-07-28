package com.rc.numberProblems;
import java.util.*;
public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=sc.nextInt();
		System.out.println("Enter the value of b :");
		int b=sc.nextInt();
		System.out.println("Enter the value of c :");
		int c=sc.nextInt();
		System.out.println(findLargest(a,b,c));
		
	}
	public static int findLargest(int num1,int num2,int num3) {
		int largest=num1;
		if(num2>largest && num2>num3) {
			largest=num2;
		}
		else if(num3>largest && num3 >num2 ) {
			largest=num3;
		}
		return largest;
	}

}
