
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] word = br.readLine().split("");
        int reverse = word.length - 1;

        for(int i = 0; i < word.length / 2; i++) {
            if(!word[i].equals(word[reverse--])){
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);

    }
}
