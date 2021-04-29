package week8;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(count != a){
            for(int i = 0; i <=count; i++){
                System.out.printf("*");
            }
            System.out.println();
            count++;
        }
    }
}
