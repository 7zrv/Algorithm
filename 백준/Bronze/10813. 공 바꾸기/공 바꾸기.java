
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < m; i++){
            int first = in.nextInt();
            int second = in.nextInt();
            int temp = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
