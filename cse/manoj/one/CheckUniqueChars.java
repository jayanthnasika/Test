/**
 * 
 */
package cse.manoj.one;

/**
 * @author SaiManoj
 *
 */
public class CheckUniqueChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int val = 'B' - 'a';
		System.out.println(Character.toString((char)val));
		
//		System.out.println(new CheckUniqueChars().isUniqueChars("manojivs"));
		System.out.println(0b1001<<3);
		System.out.println(0b1001000);
		System.out.println();
		
		/*print 0b1,    #1
		print 0b10,   #2
		print 0b11,   #3
		print 0b100,  #4
		print 0b101,  #5
		print 0b110,  #6
		print 0b111   #7
		print "******"
		print 0b1 + 0b11
		print 0b11 * 0b11*/
		
	}
	


	public boolean isUniqueChars2(String str){
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0){
				return false;
			}
			checker |= (1 << val);					
		}
		return true;
	}
	
	public boolean isUniqueChars(String str){
		
		if(str.length() > 256) return false;
		
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}

}
