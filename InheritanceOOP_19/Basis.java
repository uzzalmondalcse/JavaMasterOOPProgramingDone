package MasterOOPBestJava.InheritanceOOP_19;

public class Basis {

    // Inheritance private member of data setter and getter with display method create..
   private String hacker;
   private String programmer;



   public void setHacker(String hacker){
       this.hacker = hacker;
   }

   public String getHacker(){
       return hacker;
   }

   public void setProgrammer(String programmer){
       this.programmer = programmer;
   }

   public String getProgrammer(){
       return programmer;
   }



   void displayBasisInfo(){
       System.out.println("Hacker : "+getHacker());
       System.out.println("Programmer : "+getProgrammer());
   }


}
