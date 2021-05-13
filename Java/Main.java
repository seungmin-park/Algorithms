package Java;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = -1;
        int min = 1000001;
        for(int i = 0; i <x; i++){
            int y = sc.nextInt();
            if(y > max){
                max = y;
            }else if(y < min){
                min = y;
            }
        }
        System.out.printf("%d %d",min ,max);
        sc.close();
    }
}
