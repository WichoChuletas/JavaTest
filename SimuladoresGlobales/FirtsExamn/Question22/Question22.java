package SimuladoresGlobales.FirtsExamn.Question22;

public class Question22 {
    public static void foo(){
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException oob){
            RuntimeException re = new RuntimeException();
            //System.out.println(re.initCause(oob));
            re.initCause(oob);
            throw re;
        }
    }
    public static void main(String[] args) {
        try{
            foo();
        }catch(Exception re){
            System.out.println(re.getClass());
        }
    }
}