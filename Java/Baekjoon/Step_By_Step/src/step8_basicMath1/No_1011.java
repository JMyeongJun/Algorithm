package step8_basicMath1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int dist = y - x;	// �Ÿ�
			int cnt = 0;	// Ƚ��

			int max = (int) Math.sqrt(dist);	// �Ÿ��� ������ �Ҽ��� ����

			if (dist == max * max) {
				cnt = max * 2 - 1;
			} else if (dist <= max * max + max) {
				cnt = max * 2;
			} else {
				cnt = max * 2 + 1;
			}

			bw.write(cnt + "\n");
		}
		bw.flush();

		bw.close();
		br.close();
	}
}
