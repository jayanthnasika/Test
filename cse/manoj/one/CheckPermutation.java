package cse.manoj.one;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CheckPermutation.isPermutation("abc","cab"));
	}

	public static boolean isPermutation(String s1, String s2){
	    if (s1.length() != s2.length()) return false;
	    int checker = 0;
	    for(int i = 0; i < s1.length();i++ ){
	        checker ^= s1.charAt(i) ^ s2.charAt(i);
	    }

	    return checker == 0;
	}
	
}
