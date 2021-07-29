package Strings;

import java.util.*;

public class LongestSubString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string:-");
        String str= sc.nextLine();
      //  String str = "abcdab";
		String b=Longest(str);
		System.out.println(b);
       
	}

	public static String Longest(String str) {
		HashSet<Character> set=new HashSet<>();
		String overall="";
		String Tillnow="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(set.contains(c))
			{
				Tillnow="";
				set.clear();
			}
			Tillnow +=c;
			set.add(c);
			 
			 if(Tillnow.length()>overall.length())
			 {
				 overall=Tillnow;
			 }
		}
		return overall;
	}

}
