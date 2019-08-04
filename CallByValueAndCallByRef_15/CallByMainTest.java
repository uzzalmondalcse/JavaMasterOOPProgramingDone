package MasterOOPBestJava.CallByValueAndCallByRef_15;

public class CallByMainTest {

    public static void main(String args[]){

        CallByReference r1 = new CallByReference();
        r1.name = "Uzzal";
        System.out.println("Before Calling : "+r1.name);


        r1.change(r1);
        System.out.println("After calling : "+r1.name);

    }
}
