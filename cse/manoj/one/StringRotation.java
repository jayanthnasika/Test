package cse.manoj.one;

public class StringRotation {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "elloh";
		
		System.out.println(new StringRotation().checkRotation(s1, s2));
		System.out.println(new StringRotation().isRotation(s1, s2));

	}
	
	public boolean checkRotation(String s1, String s2){
		if(s1 == null || s2 == null) return false;
		if(s1.length() != s2.length()) return false;
		
		String temp = s2 + s2;
		if(temp.contains(s1)) return true;
		
		return false;
		
	}
	
	//another method
	
	public boolean isRotation(String s1,String s2) {
	    return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}

}
