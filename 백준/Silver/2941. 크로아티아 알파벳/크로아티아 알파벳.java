

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();
        int answer = 0;

        for (String alphabet : alphabets) {
            if (word.contains(alphabet)) {
                word = word.replace(alphabet, "/");
                answer++;
            }
        }

        System.out.println(word.length());
    }
}
