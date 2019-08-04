package MasterOOPBestJava.StringComparison_42;

public class StringComparison {

    public static void main(String args[]){

        // equals method doing content niye.
        // equal operator kaj kore reference niye.

        String password1 = "anis123";
        String password2 = "anis123";

        String password3 = new String("anis123");
        String password4 = new String("anis123");

        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
    }
}
