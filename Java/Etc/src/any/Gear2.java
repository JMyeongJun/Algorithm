package any;

public class Gear2 {
    public static void main(String[] args) throws InterruptedException {
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][12];
    	
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
    	
    	long start = System.currentTimeMillis();

    	for(int i = 0; i < 1; i++) {
    		calc();
    	}
    	
        System.out.println(System.currentTimeMillis() - start);
    }
    public static void calc() {
    	int[][] arr = {
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0 } };
        int[][] new_arr = new int[3][24];

        // 배열 변경
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] != 0) {
                    new_arr[i][j] = j+1;
                    new_arr[i][j+12] = j+13;
                } else {
                    new_arr[i][j] = 0;
                    new_arr[i][j+12] = 0;
                }
                
            }
        }

        // 출력 확인
        for(int i=0; i<new_arr.length; i++) {
            for(int j=0; j<new_arr[i].length; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(count(new_arr));
    }

    public static int count(int[][] arr) {
        int[] search_arr = {0,0,0};
        int count = 0;
        int min_count = 23;

        for(int i=0; i<arr[0].length; i++) {
            // arr[][i] 탐색 - 모든 행, i 열을 탐색 
            if(arr[0][i] != 0 || arr[1][i] != 0 || arr[2][i] != 0) {
                // 0 이 아닌 애들만 search_arr 에 쌓아가기
                if(arr[0][i] != 0) {
                    search_arr[0] = arr[0][i];
                }
                if(arr[1][i] != 0) {
                    search_arr[1] = arr[1][i];
                }
                if(arr[2][i] != 0) {
                    search_arr[2] = arr[2][i];
                }

                System.out.print((i+1) +" 번째 현재 search : " + search_arr[0]);
                System.out.print(" " + search_arr[1]);
                System.out.println(" " + search_arr[2]);

                // 중간 값
                if(search_arr[0] != 0 && search_arr[1] != 0 && search_arr[2] != 0) {
                    // 중간 값을 기준으로 각 항의 차(절대값)를 count 에 대입 
                    count = Math.abs(search_arr[0] - mid_num(search_arr[0], search_arr[1], search_arr[2])) +
                            Math.abs(search_arr[1] - mid_num(search_arr[0], search_arr[1], search_arr[2])) +
                            Math.abs(search_arr[2] - mid_num(search_arr[0], search_arr[1], search_arr[2]));
                            if(min_count > count) {
                                min_count = count;
                            }
                    count = 0;
                }
            }
        }
        return min_count;
    }

    // 3 정수 중에 중간 값 return
    public static int mid_num(int a, int b, int c) {
        if((a>=b && a<=c) || (a<=b && a>=c) ) {
            return a;
        } else if ((b>=a && c>=b) || (b<=a && b>=c)) {
            return b;
        } else {
            return c;
        }
    }
}