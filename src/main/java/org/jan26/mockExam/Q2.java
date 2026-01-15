package org.jan26.mockExam;

import java.util.*;

public class Q2{
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
		
		
		System.out.println("Enter Target Element");
		int target = sc.nextInt();
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if((arr[i]+arr[j]) == target)	System.out.print("("+arr[i]+", "+arr[j]+"), ");
			}
		}
		
	}
}