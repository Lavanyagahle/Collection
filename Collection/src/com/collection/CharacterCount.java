package com.collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
//public static Map<Character,Integer>countChar(char[] arr){
	public static Map<Character,Integer>countChar(String s){
		char carr[] = s.toCharArray();
	Map<Character ,Integer> charCount= new HashMap<>();
	for(char c:carr) {

		if(charCount.containsKey(c)) {
			charCount.put(c,charCount.get(c)+1);
		}else {
			charCount.put(c, 1);
		}
	}
		return charCount;	
			
}
public static void main(String[] args) {
	//char [] arr= {'a','f','c','d','a','c'};
	String str="af123cdac";
	Map<Character,Integer> charCount= countChar(str);
	System.out.println(charCount);
}
}
