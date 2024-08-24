import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int[] result = new int[t];

        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int squared = 1;
            
            for(int j = 0; j < b; j++){
                squared = (squared * a) % 10;
            }

            if(squared == 0){
                squared = 10;
            }
            result[i] = squared;
        }
        in.close();

        for(int i = 0; i < t; i++){
            System.out.println(result[i]);
        }
    }

}
