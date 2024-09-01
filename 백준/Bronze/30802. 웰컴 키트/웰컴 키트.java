


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        StringTokenizer tshirt = new StringTokenizer(br.readLine(), " ");
        List<Integer> size = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            size.add(Integer.parseInt(tshirt.nextToken()));
        }

        StringTokenizer tp = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(tp.nextToken());
        int p = Integer.parseInt(tp.nextToken());

        int countTshirt = 0;

        for (int i = 0; i < 6; i++) {
            if(size.get(i) <= t && size.get(i) != 0) {
                countTshirt++;
            }else {
                countTshirt += (size.get(i) / t) + (size.get(i) % t > 0 ? 1 : 0);
            }
        }

        System.out.println(countTshirt);
        System.out.println(n / p + " " + n % p);
    }

}
