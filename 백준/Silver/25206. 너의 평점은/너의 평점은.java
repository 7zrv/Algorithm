

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static String calculate(StringTokenizer st){

        st.nextToken();
        double credit = Double.parseDouble(st.nextToken());
        String grade = st.nextToken();
        double score = 0.0;

        if(grade.equals("P")){
            return "P";
        }

        switch(grade){
            case "A+": score = 4.5;
                break;
            case "A0": score = 4.0;
                break;
            case "B+": score = 3.5;
                break;
            case "B0": score = 3.0;
                break;
            case "C+": score = 2.5;
                break;
            case "C0": score = 2.0;
                break;
            case "D+": score = 1.5;
                break;
            case "D0": score = 1.0;
                break;
            case "F" : score = 0.0;
                break;
        }


        return credit * score + " " + credit;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double count = 0.0;
        double sum = 0.0;

        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String result = calculate(st);


            if(!result.equals("P")){
                StringTokenizer resultToken = new StringTokenizer(result, " ");
                sum += Double.parseDouble(resultToken.nextToken());
                count += Double.parseDouble(resultToken.nextToken());
            }



        }

        String answer = String.format("%.6f", sum / count);
        
        System.out.println(answer);


    }


}
