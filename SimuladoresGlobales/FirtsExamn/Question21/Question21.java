package SimuladoresGlobales.FirtsExamn.Question21;

import java.util.ArrayList;

public class Question21 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        System.out.println(points);
        points.remove(2);
        points.remove(null);
        System.out.println(points);
    }
}