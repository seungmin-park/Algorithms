package Java;

import java.io.*;
public class baekJoon_2741 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int x = Integer.parseInt(bf.readLine());

        for(int i = 1; i <= x; i++){
            bw.write(String.valueOf(i)+"\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
