package any;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// https://programmers.co.kr/learn/courses/30/lessons/92334?language=java

// 입력
// ["muzi", "frodo", "apeach", "neo"]	
// ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	
// 2

// 출력
// [2,1,1,0]

public class KaKao {
	public int[] solution(String[] id_list, String[] report, int k) {

		HashMap<String, HashSet<String>> list = new HashMap<String, HashSet<String>>();
		HashMap<String, Integer> reported = new HashMap<String, Integer>();

		for (String name : id_list) {
			list.put(name, null);
			reported.put(name, 0);
		}

		for (String singo : report) {
			String[] str = singo.split(" ");
			String name = str[0];
			String p = str[1];

			try {
				if (!list.get(name).contains(p)) {
					reported.put(p, reported.get(p) + 1);
				}
			} catch (Exception e) {
				reported.put(p, reported.get(p) + 1);
//				e.printStackTrace();
			}

			if (list.get(name) != null) {
				list.get(name).add(p);
			} else {
				HashSet<String> set = new HashSet<String>();
				set.add(p);
				list.put(name, set);
			}
		}

//		System.out.println(list.toString());
//		System.out.println(reported.toString());
//		System.out.println(reported.keySet().toString());
		
		ArrayList<String> reportedN = new ArrayList<String>();
		for (String name : id_list) {
			if (reported.get(name) >= k) {
				reportedN.add(name);
			}
		}

		System.out.println(reportedN.toString());
		int[] answer = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			for(String reportedName : reportedN) {
				try {
					if(list.get(id_list[i]).contains(reportedName)) {
						answer[i]++;
					}
				} catch (Exception e) {
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		KaKao k = new KaKao();
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi", "apeach muzi" };
		int n = 2;

		k.solution(id_list, report, n);
	}
}