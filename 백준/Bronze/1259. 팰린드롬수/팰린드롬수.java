
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void isPalindrome(String[] input){
        
        for (int i = 0; i < input.length / 2; i++){
            if(!input[i].equals(input[input.length - 1 - i])){
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            int n = Integer.parseInt(br.readLine());
            String[] s = String.valueOf(n).split("");

            if (n == 0){
                return;
            }

            isPalindrome(s);

        }

    }

}
