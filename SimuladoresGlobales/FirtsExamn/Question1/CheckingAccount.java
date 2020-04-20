package SimuladoresGlobales.FirtsExamn.Question1;

class CheckingAccount {
    public int ammount;
    public CheckingAccount(){
        //this.ammount = 100;
        ammount = 100;
    }
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        //acct.ammount = 100;
        System.out.println(acct.ammount);
    }
}