package SimuladoresGlobales.FirtsExamn.Question13;
public class Question13{
    int count;
    public static void displayMsg() {
        //Can not make a static refrence to the non static member
        //count++;
        //System.out.println(count);

    }
    public static void main(String[] args) {
        Question13.displayMsg();
    }
}