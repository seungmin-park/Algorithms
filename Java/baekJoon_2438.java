package Java;

import java.io.*;

public class baekJoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        for(int i = 1; i <= x; i ++){
            for(int k = x -i; k > 0 ; k--){
                bw.write(" ");
            }
            for(int j = 1; j <= i; j ++){
                bw.write("*");
            }
            bw.newLine();

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
