package MasterOOPBestJava.WriteFile_45;

import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {

    public static void main(String args[]) {

        // How to file write.. :)

        String name;
        int id;



        try {

            Formatter formatter = new Formatter("C:/Users/uzzal/Desktop/Hacker/Hacker.txt");

            Scanner sc = new Scanner(System.in);
            System.out.println("How many students");
            int sn = sc.nextInt();

            for(int i = 1; i<=sn; i++){
                System.out.println("Enter Student id and name : ");
                id = sc.nextInt();
                name = sc.next();
                formatter.format("%s%s\r\n ",id,name);
            }


            // file write
             // return then new line.
            formatter.format("%s%s\r\n ","101","Suzal");
            formatter.format("%s%s\r\n ","101","Shuvro");
            formatter.format("%s%s\r\n ","101","Sudipto");
            formatter.format("%s%s\r\n ","101","Muzahid vaia");
            formatter.close();

        }catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
