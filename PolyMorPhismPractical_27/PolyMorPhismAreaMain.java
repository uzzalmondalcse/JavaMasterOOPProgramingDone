package MasterOOPBestJava.PolyMorPhismPractical_27;

public class PolyMorPhismAreaMain {

    public static void main(String args[]) {

        // create a all class object..

        //create a array..
        Shape s[] = new Shape[3];

        //create a array index.
        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(20, 30);


        /*
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10, 20);
        Shape s3 = new Triangle(15, 25);
         */


        //call to method of for loop
        for (int i=0; i<3; i++){
            System.out.println(s[i].area());
        }


        // call to area method
        /*
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
         */



       /*
           double shape =  s1.area();
           double rectangle =  s2.area();
           double triangle =  s3.area();

        */



         /*
           System.out.println("Shape "+s1);
           System.out.println("Rectangle "+r1);
           System.out.println("Triangle "+t1);
          */

    }
}
