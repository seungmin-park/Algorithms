package Java;

import java.io.*;

public class baekJoon_1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x =Integer.parseInt(br.readLine());
        double sum = 0;
        int max = -1;
        double avg = 0.0;
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < x; i++){
            sum = sum + Integer.parseInt(s[i]);
            if(Integer.parseInt(s[i]) > max){
                max = Integer.parseInt(s[i]);
            }
        }
        avg = sum/max * 100 /s.length;
        bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		br.close();
	}
}
