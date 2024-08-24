

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        if (first == second && second == third) {
            System.out.println(10000 + first * 1000);
        } else if (first == second || first == third) {
            System.out.println(1000 + first * 100);
        } else if (second == third) {
            System.out.println(1000 + second * 100);
        } else {
            int max = Math.max(first, Math.max(second, third));
            System.out.println(max * 100);
        }


    }

}
