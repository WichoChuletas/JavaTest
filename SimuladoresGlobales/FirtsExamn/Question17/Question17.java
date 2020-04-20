package SimuladoresGlobales.FirtsExamn.Question17;
public class Question17{
    void method (int a, int b, short c){
        System.out.println(a+":"+b+":"+c);
    }
    public static void main(String[] args) {
        Question17 q = new Question17();
        q.method(1, 2, (short)3);   
        boolean b = "Hola".startsWith("H");
        System.out.println(b);
    }
}