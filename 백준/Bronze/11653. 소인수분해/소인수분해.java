
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        List<Integer> primes = new ArrayList<>();

        if(n == 1){
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0){
                primes.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            primes.add(n);
        }

        for(Integer prime : primes) {
            System.out.println(prime);
        }


    }

}
