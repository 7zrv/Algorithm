

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int multiples = 0;
        int divisor = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int min = Math.min(n, m);
        int max = Math.max(n, m);
        List<Integer> mins = new ArrayList<>();

        for (int i = 1; i <= min / 2; i++) {
            if(min % i == 0){
                mins.add(i);
            }
        }
        mins.add(min);

        for(int i : mins){
            if(max % i == 0){
                divisor = i;
            }
        }

        int count = 1;
        while (true){
            
            if((min * count) % max == 0){
                multiples = min * count;
                break;
            }
            count++;
        }

        System.out.println(divisor);
        System.out.println(multiples);


    }

}
