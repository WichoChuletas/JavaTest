package SimuladoresGlobales.FirtsExamn.Question12;
interface A111{
    String s = "yo";
    public void method1();
}
interface B{}
interface c extends A111,B{
    public void method1();
    public void method1(int x);
}