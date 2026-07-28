package com.rc.numberProblems;
import java.util.*;
public class MagicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start:");
		int start = sc.nextInt();

		System.out.println("Enter end:");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
		    if (ret(i) == 1) {
		        System.out.println(i);
		    }
		}
	}
		
		public static int add(int n) {
			int sum=0;
			while(n>0) {
				int d=n%10;
				sum+=d;
				n=n/10;
			}
			return sum;
		}
		public static int ret(int n) {

		    int res = add(n);

		    while(res > 9) {
		        res = add(res);
		    }

		    return res;
		}
			

}
