package MasterOOPBestJava.EncaptulationOOP_17;

public class Person {

    // this video we will show the encapsulation method..
      /*    just imagine in medicine variable & method. with private .
  0. Encapsulation is including a class in a package, withIn -  variable & method.. a single unit. :)
  1. First of all data hiding , Data must be declare private.
  2. Other Class access to data must be declare setter and getter method. :)
  3.
     */

    // if we want to use encapsulation, first of all data hiding   :)

    // variable & method with in include a package.
    private String name;
    private String address;
    private int age;


    // to string method call
    @Override
       public String toString() {
        return "CodeId{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    // set method create
    public void setName(String name){
        this.name = name;
    }

    // get method create.
    public  String getName(){  //  there is no value return so that parameter is empty.
        return name;          // then return address.
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }


    public void setAge(int age){
        this.age = age;

    }

    public int getAge(){
        return age;
    }



   public void displayPersonInfo(){

        System.out.println("Name : "+getName());
        System.out.println("Address : "+getAddress());
        System.out.println("age : "+getAge());
        System.out.println("\n");
    }





}
