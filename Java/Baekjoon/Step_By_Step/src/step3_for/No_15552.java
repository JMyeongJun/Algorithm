package step3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_15552 {
	public static void main(String[] args) /*throws IOException*/{
		try {	//예외처리 필수! try~catch 또는 throws IOException 해주기!!!
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < t; i++) {
				String arr[] = br.readLine().split(" ");
				bw.write((Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) + "\n");
			}
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
