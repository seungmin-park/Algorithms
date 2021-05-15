package Java;

import java.io.*;

public class baekJoon_4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x =Integer.parseInt(br.readLine());//반복횟수 입력
        int roop = 0;//반복된 횟수 카운트
        while(true){
            //반복완료시 while 탈출
            if(roop == x){
                break;
            }
            int sum = 0;
            double avg = 0.0;
            int count =0;
            String[] s = br.readLine().split(" ");//성적수와 점수들 입력
            for(int j = 0; j <Integer.parseInt(s[0]) ; j ++){
                sum += Integer.parseInt(s[j+1]);//접수합계
            }
            avg = sum/Double.parseDouble(s[0]);//점수평균
            for(int k = 0; k <Integer.parseInt(s[0]); k++){
                if(Integer.parseInt(s[k+1]) > avg){
                    count++;//평균보다 점수가 큰 학생 체크
                }
            }
            //학생평균 출력
            bw.write(String.format("%.3f",(count/Double.parseDouble(s[0])*100)) + "%\n");
            roop++;
        }
		bw.flush();
		bw.close();
		br.close();
	}
}