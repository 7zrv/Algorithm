

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < m; i++){
            int start = in.nextInt();
            int end = in.nextInt();
            int ball = in.nextInt();

            for(int j = start-1; j < end; j++){
                arr[j] = ball;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
