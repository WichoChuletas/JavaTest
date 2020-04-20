package SimuladoresGlobales.FirtsExamn.Question19;

public class Question19 {
    public static void main(String[] args) {
        Question19 q1 = new Question19();
        Question191 q2 = new Question191();
        q1.tellItLikeItIs();//line 5 //prints Right off!
        q2.tellItLikeItIs();//line 6 //prints Right on!
        ((Question192) q2).tellItLikeItIs(); //7 //prints Right on!
        ((Question192) q2).tellItLikeItIs(); //8 //prints Right on!
    }
    public void tellItLikeItIs(){
        System.out.println("Right off!");
    }
}

class Question191 extends Question19 implements Question192{
    @Override
    public void tellItLikeItIs(){
        System.out.println("Right on!");
    }
}

interface Question192{
    public void tellItLikeItIs();
}