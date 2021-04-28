package Java;

public class programmers_test1 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*10) + 1;
        int b = (int) (Math.random()*10) + 1;

        for(int i = 0; i <a; i ++){
            for(int j = 0; j <b; j ++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
