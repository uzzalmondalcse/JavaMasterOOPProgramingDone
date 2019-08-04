package MasterOOPBestJava.MethodOverloading_13;

public class Techoners {




    void techAdd(double monitor, double cpu){

         System.out.println("Monitor & pc : "+monitor+cpu);

    }


    void techAdd(double pc, double cpu, double keyboard){  // three parameterized method.
        System.out.println("Pc & Cpu & Keyboard : "+pc+cpu+keyboard);

    }

    void techAdd(double pc, double cpu, double keyboard, double vegetables){  // 4 parameterized methos.

        System.out.println("Pc & Cpu & Keyboard & vegetables : "+pc+cpu+keyboard+vegetables);
    }


    void techAdd(){        // default parameterized mehtod.

        System.out.println("Nothing to add today.. by by");

    }


}
