package MasterOOPBestJava.Recursion_16;

public class Factoiral {


        /*
        1. J method nije nijeke call korte pare take - Recursive fun bol hoye thake.
        2. Infinite call cholte thake tai call thamanor jonno base class use korbo.
        3.
         */

    // create a Recursive function.
    int fact(int n) {



            if (n == 1) {
                return 1;        // base case
            } else {

                return n * fact(n - 1);
            }

        }


    }




