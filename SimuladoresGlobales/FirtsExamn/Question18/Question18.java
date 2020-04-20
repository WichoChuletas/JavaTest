package SimuladoresGlobales.FirtsExamn.Question18;

public class Question18 {
    void method(){
        try{
            guru();//1
            return;//2
        }finally{
            System.out.println("Finally 1");//4
        }
    }
    void guru(){
        System.out.println("Guru");//3
        throw new StackOverflowError();//4
    }
    public static void main(String[] args) {
        Question18 q = new Question18();
        q.method();
    }
}