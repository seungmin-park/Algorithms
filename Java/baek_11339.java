package Java;

import java.util.Scanner;
import java.util.Arrays;
public class baek_11339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int totalMin = 0;
        int[] arr = new int[arrLength];
        for(int i = 0; i <arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i : arr){
            totalMin += i * arrLength;
            arrLength--;
        }
        System.out.println(totalMin);
        sc.close();
    }
}
