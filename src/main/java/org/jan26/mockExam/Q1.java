package org.jan26.mockExam;

import java.util.*;

public class Q1{
	public static void main(String [] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[6];
		
		System.out.println("Enter Array Elements");
		for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0 ; i < arr.length; i++){
			int key = arr[i];
			
			if(map.containsKey(key)) map.put(key, map.get(key)+1);
			else map.put(key, 1);
		}
		
		for(Map.Entry<Integer,Integer> m : map.entrySet()){
			int key = m.getKey();
			if(map.get(key) == 1){
				System.out.println("First non reapeating element is = "+key);
				break;
			}
		}
	}
}				