package com.rc.numberProblems;
import java.util.*;
public class StrongByMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			sum=sum+getFactor(num%10);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Strong no");
		}
		else {
			System.out.println("Not strong no");
		}
		
		
	}
	public static int getFactor(int num) {
		int fact=1;
		while(num>0) {
			fact*=num;
			num--;
		}
		return fact;
	}
	

}
    