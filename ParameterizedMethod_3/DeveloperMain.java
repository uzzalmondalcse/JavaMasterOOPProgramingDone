package MasterOOPBestJava.ParameterizedMethod_3;

public class DeveloperMain {

    public static void main(String args[]){


        Developer dev1 = new Developer(); // create dev1 object and
        dev1.devBio("uzzal","Android programmer",23); // parameterized method
        dev1.developerInfo();

        Developer dev2 = new Developer();
        dev2.devBio("Muzhidul Islam","WebDevelopment",34);
        dev2.developerInfo();


        Developer dev3 = new Developer();
        dev3.devBio("Shuvro dada","Android Programmer",30);
        dev3.developerInfo();


    }
}
