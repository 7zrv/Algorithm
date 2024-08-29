
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] paper = new int[100][100];
        int answer = 0;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = 99 - Integer.parseInt(st.nextToken());

            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    paper[y-j][x+k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(paper[i][j] == 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }

}
