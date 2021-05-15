package Java;

import java.io.*;
import java.util.ArrayList;

public class baekJoon_3052 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] temp = new int[10];
        ArrayList<Integer> remove = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int x = Integer.parseInt(br.readLine());
            temp[i] = x%42;
            }
        for(int i : temp){
            if(!remove.contains(i)){
                remove.add(i);
            }
        }
        bw.write(String.valueOf(remove.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}