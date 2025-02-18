
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());  
        int p = Integer.parseInt(st.nextToken());  

        int[] dnaCheck = new int[4];  
        int[] currentCount = new int[4]; 

        char[] inputArr = br.readLine().toCharArray();  

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            dnaCheck[i] = Integer.parseInt(st.nextToken());  
        }

        for (int i = 0; i < p; i++) {
            updateCount(currentCount, inputArr[i], 1);
        }

        int answer = 0;

        if (isDna(currentCount, dnaCheck)) answer++;

        for (int i = p; i < s; i++) {
            
            updateCount(currentCount, inputArr[i - p], -1);
            
            updateCount(currentCount, inputArr[i], 1);

            if (isDna(currentCount, dnaCheck)) answer++;
        }

        System.out.println(answer);
    }

    private static boolean isDna(int[] current, int[] required) {
        for (int i = 0; i < 4; i++) {
            if (current[i] < required[i]) {
                return false;  
            }
        }
        return true;  
    }

    
    private static void updateCount(int[] count, char c, int delta) {
        if (c == 'A') count[0] += delta;
        else if (c == 'C') count[1] += delta;
        else if (c == 'G') count[2] += delta;
        else if (c == 'T') count[3] += delta;
    }
}
