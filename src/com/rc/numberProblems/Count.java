package com.rc.numberProblems;
import java.util.*;
public class Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(number(n));
	}

	public static int number(int n) {
		String str=" "+ n;
		return str.length();
	}
}
