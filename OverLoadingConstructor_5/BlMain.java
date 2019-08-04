package MasterOOPBestJava.OverLoadingConstructor_5;

public class BlMain {

    public static void main(String args[]){

        // this is learn Overloading constructor.
        BloodDonar bd1 = new BloodDonar();
        BloodDonar bd2 = new BloodDonar("Uzzal","B+");
        BloodDonar bd3 = new BloodDonar("Suzal","B+",30);
        BloodDonar bd4 = new BloodDonar("Shaptami","B+",35,1980450700);


         // introducing  method call
        bd1.donarInfo();
        bd2.donarInfo();
        bd3.donarInfo();
        bd4.donarInfo();

    }
}
