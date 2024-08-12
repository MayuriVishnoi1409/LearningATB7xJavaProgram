package august;

public class Bank {
    String Name;
    int Balance;
    Bank(String Name1,int Balance1) {
        this.Name = Name1;
        this.Balance = Balance1;
    }

        void printDetails()
        {
            System.out.println("Enter your name \t" + Name);
            System.out.println("Balance of your Bank  \t" + Balance);
        }

    }

