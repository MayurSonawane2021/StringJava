package repatefirst.com;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeateString {
	public static void main(String[] args) {
		String s1= "Mamyuy";
		List<Character> f= new ArrayList<Character>();
		char ch;
		for(int i=0; i<s1.length();i++) {
			ch=s1.charAt(i);
	     String temp= s1.substring(i+1,s1.length());
	     if(!temp.contains(ch + " ")) {
	    	 System.out.println(ch);
	     }
	     break;
		}
	}

}
