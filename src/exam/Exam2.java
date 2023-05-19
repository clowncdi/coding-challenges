package exam;

import java.io.*;

public class Exam2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			String[] split = br.readLine().split(" ");
			bw.write(Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
