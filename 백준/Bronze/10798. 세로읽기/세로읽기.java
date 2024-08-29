import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[5][15];
        String answer = "";

        for(int i = 0; i < 5; i++) {
            String word = br.readLine();
            for(int j = 0; j < word.length(); j++) {
                arr[i][j] = String.valueOf(word.charAt(j));
            }
        }

        for(int i = 0; i < 15; i++) {
            
            for(int j = 0; j < 5; j++) {
                
                if(arr[j][i] != null) {
                    answer += arr[j][i];
                }
            }
        }

        System.out.println(answer);
    }

}
