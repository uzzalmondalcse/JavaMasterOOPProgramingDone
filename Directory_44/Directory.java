package MasterOOPBestJava.Directory_44;

import java.io.File;

public class Directory {

    public static void main(String args[]){




        // first of all crate directory
        File dir  = new File("C:/Users/uzzal/Desktop/Hacker");
        dir.mkdir(); // create directory.
        String path = dir.getAbsolutePath();

        /*
        String path = dir.getAbsolutePath(); // declare to path.
        System.out.println("Path : "+path);
        System.out.println(dir.getName()); // dir name.

        if (dir.delete()){
            System.out.println(dir.getName()+" Directory is delete now.");
        }
         */

        //second of all crate a file.. :)

        File file = new File(path+"Hacker.txt");
        File file1 = new File(path+"programmer.txt");

        try{

            file.createNewFile();
            file1.createNewFile();
            System.out.println("Files are create ");

        }catch (Exception e){

            System.out.println("Exception "+e);
        }


        // file deleted to exists.
     file1.delete();



        // file exist method call
        if (file1.exists()){

            System.out.println("File are Exists");
        }else {
            System.out.println("File does not Exists.");
        }

    }
}
