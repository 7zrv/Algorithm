

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int payment = in.nextInt();
        int totalCount = in.nextInt();
        int temp = 0;

        for (int i = 0; i < totalCount; i++) {
            int price = in.nextInt();
            int count = in.nextInt();
            temp += price * count;
        }

        if (temp == payment) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }

    }
}
