
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int thisNumsResult(int num){
        String[] slicedNum = String.valueOf(num).split("");


        for(String s : slicedNum){
            num += Integer.parseInt(s);
        }

        return num;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        for (int i = 1; i < number; i++) {
            if(thisNumsResult(i) == number){
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);

    }

}
