package SimuladoresGlobales.FirtsExamn.Question11;
public class Point2D{
    private int x, y;
    public Point2D(int x, int y){
        this.x = x;
        //y = y;//the assignment to a varible "y" has no effect
    }
    public String toString(){
        return "["+x+":"+y+"]";
    }
    public static void main(String[] args) {
        Point2D point = new Point2D(10, 20);
        System.out.println(point);
    }
}