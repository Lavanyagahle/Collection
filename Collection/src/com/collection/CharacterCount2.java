package com.collection;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	 class Source2{
	  Map<Character, Integer> countChars(char []arr) {
		  Map<Character, Integer> mp = new HashMap<>();
		  for(int i = 0; i < arr.length; i++) {
			  if(arr[i] != ' ') {
				  if(mp.containsKey(arr[i])) {
					  int val = mp.get(arr[i]);
					  val = val+1;
					  mp.put(arr[i],val);
				  }
				  else {
					  mp.put(arr[i],1);
				  }
				  
			  }
		  }
		  return mp;
	  }
	}
	public class CharacterCount2 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Map <Character, Integer> res = new HashMap<>();
				Source2 sr = new Source2();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter string ");
				String s = sc.nextLine();
				res=sr.countChars(s.toCharArray());
				System.out.println(Integer.parseInt(s));
			}

		}	

