
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coin = {25, 10, 5, 1};
        int change = 0;
        int[] count = new int[4];

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            change = Integer.parseInt(br.readLine());


            for (int j = 0; j < count.length; j++) {
                count[j] = change / coin[j];
                change = change % coin[j];
            }

            for (int k = 0; k < count.length; k++) {
                System.out.print(count[k] + " ");
            }
            System.out.println();

        }



    }

}
