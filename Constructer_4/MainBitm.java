package MasterOOPBestJava.Constructer_4;

public class MainBitm {

    public static void main(String args[]){

        //method is call, constructor no need for call just parameterized declare.
        Bitm b1 = new Bitm("Uzzal","Android",20); // parameterized declare.
        b1.bitmInfoCall();

        Bitm b2 = new Bitm("Shudipto","Python with AI",25); // parameterized declare.
        b2.bitmInfoCall();

        Bitm b3 = new Bitm(); // default constructor, no need declare parameter :)
        b3.bitmInfoCall();


    }
}
