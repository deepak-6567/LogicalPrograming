package com.rc.numberProblems;
import java.util.*;
public class Divisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int n=sc.nextInt();
		System.out.println(retur(n));
		
	}
	public static String retur(int n) {
		if((n%5==0)&&(n%3==0))
			return "Ram&Laskman";
		else if(n%5==0)
			return "Ram";
		else if(n%3==0)
			return "laskman";
		else 
			return "not";
	}

}
