package cse.manoj.one;


public class MergeSort {
	
	public void mergesort(int[] array){
		
		System.out.println("Before Sorting::");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");	
		}
		
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length-1);
	}

	private void mergesort(int[] array, int[] helper, int lowIndex, int highIndex) {
		int[] finArray = null;
		if(lowIndex < highIndex) {
			int middleIndex = (lowIndex + highIndex)/2;
			mergesort(array, helper, lowIndex, middleIndex);
			mergesort(array, helper, middleIndex + 1, highIndex);
			finArray = merge(array, helper, lowIndex, middleIndex, highIndex);
		}		
		if(finArray!=null){
			System.out.println("After Sorting::");
			for (int i = 0; i < finArray.length; i++) {
				System.out.print(finArray[i] + " ");	
			}
		}
	}

	private int[] merge(int[] array, int[] helper, int lowIndex, int middleIndex, int highIndex) {
		for (int i = lowIndex; i <= highIndex; i++) {
			helper[i] = array[i];
		}
		
		int helperLeft = lowIndex;
		int helperRight = middleIndex + 1;
		int current = lowIndex;
		
		while(helperLeft <= middleIndex && helperRight <= highIndex){
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		int remaining = middleIndex - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i]; 
		}
		
		return array;
		
		/*System.out.println("After Sorting::");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");	
		}*/
	}
	
	

}
