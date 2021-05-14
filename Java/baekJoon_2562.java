package Java;

import java.io.*;

public class baekJoon_2562 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] s = new int[9];
        int max = -1;
        for(int i = 0; i < 9; i++){
            int x = Integer.parseInt(br.readLine());
            s[i] = x;
            if(x > max){
                max = x;
            }
        }
        bw.write(String.valueOf(max)+"\n");
        int count = 1;
        for(int i : s){
            if(i == max){
                bw.write(String.valueOf(count));
                break;
            }
            count++;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}