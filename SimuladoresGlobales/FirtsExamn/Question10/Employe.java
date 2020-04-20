package SimuladoresGlobales.FirtsExamn.Question10;
interface Data{
    public void load();
}
abstract class Info{
    public abstract void load();
}
public class Employe extends Info implements Data{
    public void load(){
        System.out.println("load");
    }
}