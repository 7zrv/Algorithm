

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static boolean isGroup(String word){

        List<String> list = new ArrayList<>();
        list.add(word.charAt(0)+"");

        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i) != word.charAt(i+1)){
                if(list.contains(word.charAt(i+1)+"")){
                    return false;
                }
                list.add(word.charAt(i+1)+"");
            }
        }

        return true;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < n; i++){
            String word = br.readLine();
            if(isGroup(word)){
                answer++;
            }

        }

        System.out.println(answer);
    }


}
