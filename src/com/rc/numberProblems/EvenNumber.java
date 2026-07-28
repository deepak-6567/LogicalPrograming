package com.rc.numberProblems;
import java.util.*;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("the entered number is even");
		}
		else {
			System.out.println("Not a Even Number");
		}
	}

}
