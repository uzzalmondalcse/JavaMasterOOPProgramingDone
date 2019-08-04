package MasterOOPBestJava.TypeCusting_36;

public class Type {

    /*\
    1. A data type to another data type If you want to switch must declare to type casting.
    2. Type casting are two type , 1.implicit ,  2.explicit type casting.
    3. byte - short - int - long - float - double. - widening.
     memory space arranging.
     4.
     */

    public static void main(String args[]){


        // implicit type casting.
        int x  = 10;
        double y = x; // type casting.
        System.out.println(y);

        // Explicit type casting.
        double d =10.00;
        int i = (int) d;
        System.out.println(i);

        // int - byte.
        int ab = 10;
        byte ba = (byte) ab;
        System.out.println(ba);

       // float - short
        float fl = 12.20f;
        short st = (short) fl;
        System.out.println(st);


    }
}
