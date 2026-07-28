package com.rc.numberProblems;
import java.util.*;
public class PrimePalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		if(getPrime(n)==0 && getPalindrome(n)==n)
		{
			System.out.println("it is prime palindrome");
		}
		else
		{
			System.out.println("It is not");
		}
		
	}
	public static int getPrime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
			return count;
	}
	public static int getPalindrome(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
		}
}
