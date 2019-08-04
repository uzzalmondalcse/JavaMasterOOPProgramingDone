package MasterOOPBestJava.VariableLengthArgument_16;

public class VariableLength {

    /*
    1. Onekgulo parameter use na kore amara akti method er maddhome sob data access
    kore argument er madhdhome pass korte parsi.. :)
     */

    void add(int... num) {

        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }

        System.out.println(sum);

    }




    /*

     // create method for data pass.
    // 2 parameter call to 2 parameter object .

    void add(int a, int b){
        System.out.println(a+b);
    }

    // 3 parameter call to 3 parameter object.
    void  add(int a, int b, int c){
        System.out.println(a+b+c);
    }

       */

    // enhance loop / for each loop create to object..


    public static void main(String args[]) {

        // variable length argument er maddhome akadhik data pass korte parbo akta method er maddhome.


        VariableLength val = new VariableLength();
        val.add(10, 20);
        val.add(10, 20, 30);
        val.add(10, 20, 30, 40, 50);
    }
}
