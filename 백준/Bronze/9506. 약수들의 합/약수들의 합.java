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

        return factors;
    }

    public static int checkCompleted(List<Integer> factors) {

        int result = 0;

        for (Integer factor : factors) {
            result += factor;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> factors = new ArrayList<>();


        while (true) {

            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            String answer = "";

            if (n == -1) {
                return;
            }

            factors = findFactor(n);
            sum += checkCompleted(factors);


            if (sum == n) {
                answer += n + " = ";
                for(int i = 0; i < factors.size(); i++) {
                    if(i == factors.size() - 1) {
                        answer += factors.get(i)+ "";
                        break;
                    }
                    answer += factors.get(i) + " + ";
                }
                System.out.println(answer);
            }else {
                answer += n + " is NOT perfect.";
                System.out.println(answer);
            }


        }





    }

}
