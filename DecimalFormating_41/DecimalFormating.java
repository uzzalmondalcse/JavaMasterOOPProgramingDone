package MasterOOPBestJava.DecimalFormating_41;

import java.text.DecimalFormat;

public class DecimalFormating {
    public static void main(String args[]){

        // dosomiker pore 2 ghor dakboo..
        double x = 2.9875488;
        System.out.printf("X = %.2f",x);

        System.out.println("");


        // java
        DecimalFormat db = new DecimalFormat("0.000");
        double d = 10.2564589;
        System.out.println("D :"+db.format(d));

    }
}
