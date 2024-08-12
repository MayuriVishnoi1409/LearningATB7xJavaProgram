package august;

public class BankAccount {

    String name;
    String code;
    int balance;

    //DC
    BankAccount(){
        name="SBI";
        code="SBI001";
        balance=0;
    }
    //PC

      BankAccount(String BAname,String BAcode,int bal){
        this.name=BAname;
        this.code=BAcode;
        this.balance=bal;

    }
    void printDetails()
    {
        System.out.println("bank name -->" + name);
        System.out.println("bank code -->" + code);
        System.out.println("bank balance -->" + balance);

    }
}
