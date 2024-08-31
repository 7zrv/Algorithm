

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static Boolean isPrime(int n) {


        if(n == 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {

            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            if(isPrime(Integer.parseInt(st.nextToken()))) {
                answer++;
            }
        }

        System.out.println(answer);

    }

}
