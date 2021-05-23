package Java;

import java.io.*;

public class baekJoon_2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int max = 0;
		int x = Integer.parseInt(s[0]);
		x = (x%10*100)//백의자리
         +(x%100/10*10)//십의자리
          +(x/100);//일의자리
		int y = Integer.parseInt(s[1]);
		y = y%10*100 +(y%100/10*10) +(y/100);
		if(x > y){
			max = x;
		}
		else{
			max = y;
		}

		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
}
