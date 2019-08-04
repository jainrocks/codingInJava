package GFG;

import java.lang.StringBuffer;

public class AppendCode {
	
	public static void main(String[] args) {
		
		StringBuffer SB = new StringBuffer("JAVA");
		System.out.println(SB);
		
		//now using append code method of stringbuffer
		SB.appendCodePoint(43);
		
		System.out.println("After appending code point SB: "+ SB);
		
	}
}
