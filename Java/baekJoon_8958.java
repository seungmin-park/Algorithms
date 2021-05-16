package Java;

import java.io.*;

public class baekJoon_8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x =Integer.parseInt(br.readLine());//반복횟수 입력
        for(int i = 0; i < x ; i++){
            int count = 0;//O의 몇번 연속되는지 체크
            int result = 0;//점수 합
            String[] answers = br.readLine().split("");//OX퀴즈 결과 입력
            for(int j = 0; j < answers.length;j ++){
                if(answers[j].equals("O")){
                    count++;
                    result += count;
                }
                else if(answers[j].equals("X")){
                    count = 0;
                    result += count;
                }
            }
            System.out.println(result);
        }
		bw.flush();
		bw.close();
		br.close();
	}
}
