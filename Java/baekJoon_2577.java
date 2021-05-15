package Java;

import java.io.*;

public class baekJoon_2577 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        String result = String.valueOf(x * y * z);
        int[] temp = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < result.length(); i ++){
            if(result.charAt(i) == '0'){
                temp[0]++;
            }
            else if(result.charAt(i) == '1'){
                temp[1]++;
            }
            else if(result.charAt(i) == '2'){
                temp[2]++;
            }
            else if(result.charAt(i) == '3'){
                temp[3]++;
            }
            else if(result.charAt(i) == '4'){
                temp[4]++;
            }
            else if(result.charAt(i) == '5'){
                temp[5]++;
            }
            else if(result.charAt(i) == '6'){
                temp[6]++;
            }
            else if(result.charAt(i) == '7'){
                temp[7]++;
            }
            else if(result.charAt(i) == '8'){
                temp[8]++;
            }
            else if(result.charAt(i) == '9'){
                temp[9]++;
            }
        }
        
        for(int i : temp){
            bw.write(String.valueOf(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
