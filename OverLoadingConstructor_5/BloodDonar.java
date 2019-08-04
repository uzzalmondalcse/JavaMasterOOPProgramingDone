package MasterOOPBestJava.OverLoadingConstructor_5;

public class BloodDonar {

    // declare to class properties.
    String donarName;
    String group;
    int donarAge;
    int phnNum;

    // declare to  OverLoading Constructor.
    // just change a parameter list :)
    // class name must using to constructorName :)
    // important topics , this keyword call to parent constructor :)

    BloodDonar(){
        System.out.println("Default constructer. no found data.");
    }

    BloodDonar(String donarName,  String group){
        this.donarName = donarName;
        this.group = group;


    }

    BloodDonar(String donarName, String group, int donarAge){

        this(donarName,group); // this keyword call to parent constructor.
        this.donarAge = donarAge;


    }

    BloodDonar(String donarName, String group, int donarAge, int phnNum){
        this(donarName,group,donarAge);  //  this keyword call to parent constructor.
        this.phnNum = phnNum;
    }

    // Introducing method declare.
    void donarInfo(){
        System.out.println("Name: "+donarName);
        System.out.println("Blood Group: "+ group);
        System.out.println("Age: "+donarAge);
        System.out.println("Contact: "+phnNum);
        System.out.println("\n");
    }

}
