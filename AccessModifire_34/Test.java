package MasterOOPBestJava.AccessModifire_34;

import MasterOOPBestJava.AccessModifire_35.Bitm;


public class Test extends Bitm{

    public static void main(String args[]){


        // private
        B b = new B();
        b.number = 10;     // this is private don't access reason it is other class.
        b.display();       // cannot assign to method. reason private method. call...


       // public class.
        A a = new A();     // public package and class using no restriction.
        a.name = " uzzal ";
        a.display();

        //public other package class.
        Bitm bit = new Bitm();
        bit.bitm = "BITM";




        /*
        Private: - You have to declare to private keyword access to just this is Class,
        Can't to assign Any class with any package ;
         */

        /*
        Public  - you have to declare to public keyword, access to any any class, with package.
        there is restriction ..
         */

        /*
        Protected  - Same Package, same class. access to Protect member,
        Onno package er sub class access to need must declare to extends keyword.

         */


        /*
        default : - just access  to packaging .
         */
    }
}
