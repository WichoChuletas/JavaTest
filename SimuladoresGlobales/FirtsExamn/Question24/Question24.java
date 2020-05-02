package SimuladoresGlobales.FirtsExamn.Question24;

import java.io.IOException;

public class Question24 {
    public Question24(int port){
        if(Math.random()>0.5){
            System.out.println("IOException");
            //throw new IOException();
        }
        throw new RuntimeException();
    }
}
class Question241{
    public static void main(String[] args) {
        try{
            Question24 q = new Question24(10);
            System.out.println(q);
        }catch(RuntimeException re){
            re.printStackTrace();
        }
    }
}
