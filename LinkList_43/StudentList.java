package MasterOOPBestJava.LinkList_43;

import MasterOOPBestJava.IntroducingMethod_2.Student;

import java.util.LinkedList;

public class StudentList {

    String name,dept;
    int id;

    StudentList(String name, String dept, int id){

        this.name = name;
        this.dept = dept;
        this.id = id;
    }


    public static void main(String args[]){

        // student linked list.
        LinkedList<StudentList> list = new LinkedList<StudentList>();

        // student create.
        StudentList s1 = new StudentList("uzzal","CSE",1);
        StudentList s2 = new StudentList("suzal","CSE",2);
        StudentList s3 = new StudentList("shaptami","CSE",3);
        StudentList s4 = new StudentList("Suvash","CSE",4);


        //adding student to the student list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (StudentList s : list){

            System.out.println(s.id+" "+s.name+" "+s.id);
        }
    }

}
