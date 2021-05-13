package Java;

import java.io.*;
public class baekJoon_11021 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int x = Integer.parseInt(bf.readLine());
        for(int i = 1; i <= x; i++){
            String s = bf.readLine();
            String[] temp = s.split(" ");
            int sum = (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
            bw.write("Case #"+i+": "+sum+"\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
