package SimuladoresGlobales.FirtsExamn.Question15;
public class Question15{
    public static void main(String[] args) {
        String[] names = {"Thomas","Peter","Joseph"};
        String[] pwd = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        }catch(Exception e){
            System.out.println("Invalid Names");
        }
        for(String p :  pwd){
            System.out.println(p);
        }

        //----------------------------------------------------
        //for(long j = 1, int longvar = 15; j<=4; ++j, longvar--){
        //        System.out.println(j+":"+longvar);
        //}
        //----------------------------------------------------
        int []x[] = {{1,2},{3,4,5},{6,7,8,9}};
        int y[][] = x;
        System.out.println(y[2][1]);

    }
}