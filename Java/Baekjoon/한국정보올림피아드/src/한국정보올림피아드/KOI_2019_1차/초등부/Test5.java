package �ѱ������ø��ǾƵ�.KOI_2019_1��.�ʵ��;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Test5 {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(new URL("https://developers.naver.com/inc/devcenter/downloads/categoryList.txt").openStream());
		
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		
	}
}
