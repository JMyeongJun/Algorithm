package any;

import java.util.ArrayList;

public class Gear {
//	0 1 1 0 0 0 0 1 0 1 1 0 톱니1
//	1 0 0 0 0 1 0 0 1 1 0 0 톱니2
//	0 0 1 0 0 0 0 0 0 0 0 0 톱니3
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

//		int[][] gear = {
//				{ 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0 }, 
//				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
//				{ 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1 } };
		
		

		// debuging code
//		System.out.println(getOneIndex(gear));
		
		// 최종 출력
		for(int i = 0; i < 10000; i++) {
			calc();
		}
		
		System.out.println(System.currentTimeMillis() - start);
	}
	
	public static void calc() {
		int[][] gear = {
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0 } };
		System.out.println(getMinPath(getOneIndex(gear)));
	}

	// '1'인 인덱스 값을 이중 ArrayList로 return
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
	
	// getOneIndex 반환값을 매개변수로 최소 거리 계산 후 거리 반환
	public static int getMinPath(ArrayList<ArrayList<Integer>> indexList) {
		ArrayList<Integer> temp;
		int size = indexList.size(); // == 3
		int minPath = 12;
		
		for(int i = 0; i < size; i++) {
			temp = indexList.remove(i);
			int tempsize = temp.size();
			int listsize0 = indexList.get(0).size();
			int listsize1 = indexList.get(1).size();
			
			for(int j = 0; j < tempsize; j++) {
				for(int k = 0; k < listsize0; k++) {
					for(int z = 0; z < listsize1; z++) {
						int path = 
						getPath(temp.get(j), indexList.get(0).get(k)) +
						getPath(temp.get(j), indexList.get(1).get(z));
						
						if(path < minPath) {
							minPath = path;
						}
					}
				}
			}
			
			// debuging code
//			System.out.println(temp);
//			System.out.println(indexList);
			indexList.add(i, temp);
		}
		
		return minPath;
	}
	
	// 배열 인덱스 사이 거리 계산
	public static int getPath(int idx1, int idx2) {
		int ret = Math.abs(idx1 - idx2);
		if(ret > 12/2) {
			ret = Math.abs(ret - 12);
		}
		
		return ret;
	}

}
