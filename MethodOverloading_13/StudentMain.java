package MasterOOPBestJava.MethodOverloading_13;

public class StudentMain {

    public static void main(String args[]){

        StudentOverLoading std = new StudentOverLoading();
        std.stdMethod("Uzzal","CSE","Khulna",24);
        std.stdmethod("Suzal",24);
        std.stdmethod("Shaptami","HouseWife",40);


        StudentOverLoading std1 = new StudentOverLoading();
        std1.stdMethod("Sudipto","CSE","Khulna",24);
        std1.stdmethod("Muzahid vai",24);
        std1.stdmethod("Nazmul","Webdeveloper",40);



    }
}
