package Java;

import java.io.*;
public class baekJoon_2438 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = br.read();
        int count = 0;
        for(int i = 0; i < x; i ++){
            count++;
            for(int j = 0; j <count; j ++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
