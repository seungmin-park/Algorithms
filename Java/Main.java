package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        String[] s;
        for(int i =0; i< x; i++){
            String temp = br.readLine();
            s= temp.split(" ");
            bw.write(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
