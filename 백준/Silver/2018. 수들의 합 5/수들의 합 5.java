import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int sum = i;
            if(sum == n){
                count++;
                break;
            }
            
            for (int j = i+1; j <= n; j++) {
                if(sum == n){
                    count++;
                    break;
                }
                if(sum > n){
                    break;
                }
                sum += j;
            }
        }


        System.out.println(count);

    }
}