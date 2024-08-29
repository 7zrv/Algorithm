

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] a = new int[row][col];

        for(int i = 0; i < row * 2; i++){
            StringTokenizer input = new StringTokenizer(br.readLine());
            if(i < row)
            {
                for(int j = 0; j < col; j++){
                    a[i][j] = Integer.parseInt(input.nextToken());
                }
            } else{
                for(int j = 0; j < col; j++){
                    a[i-row][j] += Integer.parseInt(input.nextToken());
                }
            }

        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }


}
