package Java;

import java.io.*;
public class baekJoon_11022 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int x = Integer.parseInt(bf.readLine());
        for(int i = 1; i <= x; i++){
            String s = bf.readLine();
            String[] temp = s.split(" ");
            if(Integer.parseInt(temp[0]) > 10 || Integer.parseInt(temp[1]) >10){
                return;
            }
            int sum = (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
            bw.write("Case #"+i+": " + Integer.parseInt(temp[0])+ " + " + Integer.parseInt(temp[1])+" = "+sum+"\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}