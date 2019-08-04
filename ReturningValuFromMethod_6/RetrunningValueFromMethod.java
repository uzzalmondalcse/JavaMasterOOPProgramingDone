package MasterOOPBestJava.ReturningValuFromMethod_6;

public class RetrunningValueFromMethod {

    // class return define method();  square.
    int square(int value) {      // square method , return type int..)

        return value * 5;
    }


    // create a return define method. adding
    int add(int value) {
        return value + 10;
    }

    int subtractor (int value) {
        return value - 8;

    }
       // string data return..
    String data (String name){
        return name;
     }

    public static void main(String args[]) {


        // How to return a value from  a method.
        RetrunningValueFromMethod rt = new RetrunningValueFromMethod();
        int res = rt.square(5);
        System.out.println("Square Result " + res);


        RetrunningValueFromMethod rv = new RetrunningValueFromMethod();
        System.out.println("The Adding result : " + rv.add(10));


        RetrunningValueFromMethod sub  = new RetrunningValueFromMethod();
        System.out.println("The Subtractor result :"+sub.subtractor(20));


        RetrunningValueFromMethod db = new RetrunningValueFromMethod();
        System.out.println("Name :"+db.data("Uzzal Mondal"));


    }
}
