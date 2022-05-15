package step9_recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_17478 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		bw.write(recursion("", n));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static String recursion(String underline, int num) {
		String ret = "";
		ret = underline + "\"����Լ��� ������?\"\n";
		if(num >= 1) {
			ret += underline + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n";
			ret += underline + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n";
			ret += underline + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n";
			ret += recursion(underline + "____", num - 1);
		}else {
			ret += underline + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n";
		}
		ret += underline + "��� �亯�Ͽ���.\n";
		
		return ret;
	}
}
