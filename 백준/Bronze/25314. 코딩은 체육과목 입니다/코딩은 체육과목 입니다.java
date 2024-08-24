

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String answer = "int";

        for (int i = 0; i < n / 4; i++) {
            answer = "long " + answer;
        }

        System.out.println(answer);

    }
}
