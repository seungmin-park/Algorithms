package Java;

import java.io.*;

public class baekJoon_1712 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int x= Integer.parseInt(s[0]);
        int y= Integer.parseInt(s[1]);
        int z= Integer.parseInt(s[2]);
        long count = 1;
        long temp = 0;
        long temp2 = 0;
        while(true){
            temp = x + y*count;
            temp2 = z *count;
            if(temp < temp2){
                break;
            }
            else{
                count++;
            }
            if(z -y <=0){
                count = -1;
                break;
            }
        }
        System.out.println(count);
        bw.flush();
        br.close();
        bw.close();
    }
}
