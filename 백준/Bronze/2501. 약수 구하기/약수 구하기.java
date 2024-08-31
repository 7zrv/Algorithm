import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static List<Integer> findFactor(int n) {
        List<Integer> factors = new ArrayList<>();


        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }

        factors.add(n);

        return factors;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int number = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        List<Integer> factors = findFactor(number);
        if(count > factors.size()) {
            System.out.println(0);
        }else{
            System.out.println(factors.get(count-1));
        }

    }

}
