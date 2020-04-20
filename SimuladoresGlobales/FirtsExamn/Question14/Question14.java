package SimuladoresGlobales.FirtsExamn.Question14;
interface Exportable{
    void export();
}
class Tool implements Exportable{
    public void export(){
        System.out.println("Tool:Export");
    }
}
//Redundant superinterface Exportable for the type ReportTool, already defined by Tool
class ReportTool extends Tool /*implements Exportable*/{
    public void export() {
        System.out.println("Rtool:Export");
    }
    public static void main(String[] args) {
        Tool a = new ReportTool();
        Tool b = new Tool();
        callExport(a);
        callExport(b);
    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}
