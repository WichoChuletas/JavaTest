package SimuladoresGlobales.FirtsExamn.Question16;
public class Question161 extends Question16{
    public void calculate(){
        value -=3;//4 value = -3
    }
    public void calculate(int x){
        calculate();//3 value = -3
        super.calculate(); //5 value = 4
        value *= x; //value = 8
    }
    public static void main(String[] args) {
        Question161 q = new Question161();//1
        q.calculate(2);//2
        System.out.println(q.value);//8
        /* // */
        System.out.println("Comment");

    }
}