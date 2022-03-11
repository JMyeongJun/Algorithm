package any;

import java.util.ArrayList;

public class Gear {
//	0 1 1 0 0 0 0 1 0 1 1 0 톱니1
//	1 0 0 0 0 1 0 0 1 1 0 0 톱니2
//	0 0 1 0 0 0 0 0 0 0 0 0 톱니3
	public static void main(String[] args) {

		int[][] gear = {
				{ 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0 }, 
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1 } };

//		System.out.println(getOneIndex(gear));
		System.out.println(getMinPath(getOneIndex(gear)));
	}

	public static ArrayList<ArrayList<Integer>> getOneIndex(int[][] arr) {
		ArrayList<ArrayList<Integer>> indexList = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < arr.length; i++) {
			ArrayList<Integer> index = new ArrayList<Integer>();
			
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					index.add(j);
				}
			}
			
			indexList.add(index);
		}
		return indexList;
	}
	
	public static int getMinPath(ArrayList<ArrayList<Integer>> indexList) {
		ArrayList<Integer> temp;
		int size = indexList.size(); // == 3
		int minPath = 12;
		
		for(int i = 0; i < size; i++) {
			temp = indexList.remove(i);
			
			for(int j = 0; j < temp.size(); j++) {
				
				for(int k = 0; k < indexList.get(0).size(); k++) {
					
					for(int z = 0; z < indexList.get(1).size(); z++) {
						
						int path = 
						getPath(temp.get(j), indexList.get(0).get(k)) +
						getPath(temp.get(j), indexList.get(1).get(z));
						
						if(path < minPath) {
							minPath = path;
						}
						
					}
					
				}
				
			}
			
//			System.out.println(temp);
//			System.out.println(indexList);
			indexList.add(i, temp);
		}
		
		return minPath;
	}
	
	public static int getPath(int idx1, int idx2) {
		int ret = Math.abs(idx1 - idx2);
		if(ret > 12/2) {
			ret = Math.abs(ret - 12);
		}
		
		return ret;
	}

}
