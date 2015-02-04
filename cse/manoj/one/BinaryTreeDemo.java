package cse.manoj.one;


public class BinaryTreeDemo {

	public static void main(String[] args) {
		
	}
	
	public int getMaxFromTree(BinaryTreeNode root){
		
		int rootData, left, right, max = 0;
		if(root!=null){
			rootData = root.getData();
			left = getMaxFromTree(root.getLeft());
			right = getMaxFromTree(root.getRight());
			if(left > right){
				max = left;
			}
			else {
				max = right;
			}
			if(rootData > max){
				max = rootData;
			}
		}
		return max;
	}

}


