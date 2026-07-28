package com.rc.numberProblems;
import java.util.*;

public class SumOfNaturalNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		//int sum=num*(num+1)/2;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}


