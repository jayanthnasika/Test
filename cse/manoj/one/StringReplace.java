package cse.manoj.one;

public class StringReplace {
	public static void main(String[] args) {
		String str1 = "AE";
		String newStr = "";
		for (int i = 0; i < str1.length(); i++) {
			
			char x = str1.charAt(i);
			
			if(x == 'Y')
				newStr += 'B';
			else if(x == 'Z')
				newStr += 'C';
			else if(x == 'y')
				newStr += 'b';
			else if(x == 'z')
				newStr += 'c';
			
			else{
				int x2 = x + 2;
				newStr += Character.toString((char)x2);
			}
			
		}
		
		System.out.println(newStr);
		
	}
}
