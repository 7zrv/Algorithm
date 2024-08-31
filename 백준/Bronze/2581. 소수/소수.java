

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
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> primes = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            if(isPrime(i)){
                primes.add(i);
                answer+= i;
            }
        }

        if(primes.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(answer);
            System.out.println(primes.get(0));
        }
        
        

    }

}
