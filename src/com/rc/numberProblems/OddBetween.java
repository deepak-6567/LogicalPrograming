package com.rc.numberProblems;
import java.util.*;

public class OddBetween {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
