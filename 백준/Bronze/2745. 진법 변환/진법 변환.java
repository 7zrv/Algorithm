

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int pow = 1;
        int answer = 0;

        for(int i = n.length()-1; i >= 0; i--){

            if(n.charAt(i) >= '0' && n.charAt(i) <= '9'){
                answer += (n.charAt(i) - '0') * pow;
            } else{
                answer += (n.charAt(i) - 'A' + 10) * pow;
            }
            pow *= b;
        }

        System.out.println(answer);

    }

}
