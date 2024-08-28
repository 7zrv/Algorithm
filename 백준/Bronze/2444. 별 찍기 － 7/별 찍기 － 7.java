

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        int emp = count-1;
        int star = 0;


        for(int i = 0; i < count; i++) {
            for(int j = 0; j < emp; j++) {
                System.out.print(" ");
            }
            emp--;
            for(int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star += 2;
        }
        for(int i = 0; i < count - 1; i++) {
            for(int j = 0; j <= emp+1; j++) {
                System.out.print(" ");
            }
            emp++;
            for(int j = 0; j <= star-4; j++) {
                System.out.print("*");
            }
            System.out.println();
            star -= 2;
        }

    }
}
