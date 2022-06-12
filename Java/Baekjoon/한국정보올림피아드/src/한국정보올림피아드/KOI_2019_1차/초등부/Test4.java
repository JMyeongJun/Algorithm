package 한국정보올림피아드.KOI_2019_1차.초등부;

public class Test4 {
	public static void main(String[] args) {
		int[][] v = 
				{{1,1,0,1,1},{0,1,1,0,0},{0,0,0,0,0},{1,1,0,1,1},{1,0,1,1,1},{1,0,1,1,1}};
		System.out.println(v.length + ", " + v[0].length);
		int[] ans = solution(v);
		System.out.println(ans[0] + "," + ans[1]);
	}
	
	public static int[] solution(int[][] v) {
		int cnt = 0;
		int max = 0;
		
		for(int i = 0; i <= v.length - 1; i++) {
			for(int j = 0; j <= v[0].length - 1; j++) {
				if(v[i][j] == 1) {
					int area = find(v, i, j);
					max = max > area? max: area;
					cnt++;
				}
			}
		}
		
        int[] answer = {cnt, max};

        return answer;
    }
	
	public static int find(int[][] v, int i, int j) {

		v[i][j] = 0;
		int area = 1;
		
		if(i < v.length - 1) {
			if(v[i+1][j] == 1) {
				area += find(v, i+1, j);
			}
		}
		if(i > 0) {
			if(v[i-1][j] == 1) {
				area += find(v, i-1, j);
			}
		}
		if(j < v[0].length - 1) {
			if(v[i][j+1] == 1) {
				area += find(v, i, j+1);
			}
		}
		if(j > 0) {
			if(v[i][j-1] == 1) {
				area += find(v, i, j-1);
			}
		}
		
		return area;
	}
	
}
