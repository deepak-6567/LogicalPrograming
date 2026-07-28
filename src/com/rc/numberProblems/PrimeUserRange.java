package com.rc.numberProblems;
import java.util.Scanner;

public class PrimeUserRange {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Starting range");
    	int start=sc.nextInt();
    	System.out.println("Enter the ending range");
    	int end=sc.nextInt();
    	
    	for(int i=start;i<=end;i++) {
    		int count=0;
    		for(int j=2;j<=i/2;j++) {
    			if(i%j==0) {
    				count++;
    			}
    		}
    		if(count==0) {
    			System.out.println(i);
    		}
    		
    	}
    	

        
    }
}