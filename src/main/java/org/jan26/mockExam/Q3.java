package org.jan26.mockExam;

import java.util.*;
public class Q3{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Any String");
		String str = sc.nextLine();
		
		String nonRepeateSubString = "";
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(int i=0; i<str.length(); i++){
			boolean flag = false;
			char ch = str.charAt(i);
			for(int j=0; j<nonRepeateSubString.length();j++){
				if(ch == nonRepeateSubString.charAt(j)){
					flag = true;
				}
			}
			if(!flag){
				nonRepeateSubString += ch;
			}else{
				map.put(nonRepeateSubString.length(),nonRepeateSubString);
				nonRepeateSubString = "";
			}
		}
		int max = 0;
		for(Map.Entry<Integer,String> m : map.entrySet()){
			int key = m.getKey();
			if(max<key){
				max = key;
			}
		}
		System.out.println("Logest SubString = "+map.get(max));
		System.out.println("\nLogest SubString Length = "+max);
	}
}