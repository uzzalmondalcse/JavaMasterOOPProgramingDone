package MasterOOPBestJava.MethodOveridingOOP_21;

public class OverridingMain {

    public static void main(String args[]){

        /*
        1. Object crate and call to data ..
        2. Method overriding data use to call print ....
         */

        Git  gb = new Git();
        gb.bestProgram = "Java";
        gb.newProgram = ("Kotlin");
        gb.crossProgram = ("Dart");
        gb.hour = (15);
        gb.allCodingShow = ("https://github.com/uzzalcontact");
        gb.displayCodding();


        Git  gh = new Git();
        gh.bestProgram = "C";
        gh.newProgram = ("Go");
        gh.crossProgram = ("React");
        gh.hour = (1);
        gh.allCodingShow = ("https://github.com/uzzalcontact");
        gh.displayCodding();


    }
}
