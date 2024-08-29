
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;

        int[][] a = new int[9][9];
        String where = "";

        for(int i = 0; i < 9; i++){
            
            StringTokenizer input = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                
                a[i][j] = Integer.parseInt(input.nextToken());
                if(a[i][j] > max){
                    max = a[i][j];
                    where = (i + 1) + " " + (j + 1);
                }
            }
        }

        System.out.println(max);
        System.out.println(where);
        
    }
    
}
