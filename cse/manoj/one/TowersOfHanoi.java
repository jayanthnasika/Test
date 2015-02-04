package cse.manoj.one;

public class TowersOfHanoi {

	public static void main(String[] args) {
		
		new TowersOfHanoi().towersOfHanoi(4, "A", "B", "C");
		
	}
	
	
	public String towersOfHanoi(int num, String startPeg, String bufferPeg, String endPeg){
		
		if(num == 1)
			System.out.println("From "+startPeg+" To "+endPeg);
		else {
		
			towersOfHanoi(num-1, startPeg, endPeg, bufferPeg);
			System.out.println("From "+startPeg+" To "+endPeg);
			towersOfHanoi(num-1, bufferPeg, startPeg, endPeg);
			
		}	
		
		return null;
	}
	
}
