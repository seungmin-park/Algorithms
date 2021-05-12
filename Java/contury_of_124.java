package Java;

public class contury_of_124 {
    public static void main(String[] args) {
        int x = 0;
        for(int n = 1; n <=20; n++){
            if(n%3 != 0){
                if(n/3 == 0){
                    x = n%3;
                }
                else{
                    x = n/3*10 + n%3;
                }
            }else{
                x = ((n/3)-1)*10 + 4;
            }
            System.out.println("n = "+ n + "x = "+ x);
        }
    }
}
