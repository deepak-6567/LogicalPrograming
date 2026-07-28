package com.rc.numberProblems;

import java.util.*;

public class EligibleVote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int n=sc.nextInt();
		if(n>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
			
		}
	}

}
