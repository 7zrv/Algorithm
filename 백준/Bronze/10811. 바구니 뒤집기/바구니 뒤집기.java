

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < m; i++){
            int start = in.nextInt();
            int end = in.nextInt();

            int range = end - start;

            for (int j = 0; j < range; j++) {
                int temp = arr[start - 1];
                arr[start - 1] = arr[end - 1];
                arr[end - 1] = temp;

                start++;
                end--;
                if(start - end == 1 || start - end == 0){
                    break;
                }
            }

        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
