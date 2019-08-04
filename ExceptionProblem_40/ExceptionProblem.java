package MasterOOPBestJava.ExceptionProblem_40;

import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String args[]){


        while (true){

            try {


            // input class.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first data :-------");
            int num1 = sc.nextInt();
            System.out.println("Enter second data --------");
            int num2 = sc.nextInt();

            int res = num1/num2;
            System.out.println("Result : "+num1+"/"+num2+"="+res);

            }catch (Exception e){

                System.out.println("Exception : "+e);
                System.out.println("You must write to Integer num and try again.");
            }

        }


    }
}
