package MasterOOPBestJava.ExceptionHandling_39;

public class ExceptionMain {

    public static void main(String args[]){


        try{

            int [] a = new int[4];
            a[4] = 10;

            int x = 10;
            int y = 0;
            int res = x/y;

            System.out.println("Result "+x/y);


        }catch (Exception e1){

         System.out.println("Exception : "+e1);

        }finally {

            System.out.println("Line the programming.");

        }





    }
}
