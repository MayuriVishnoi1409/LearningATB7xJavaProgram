package august;

import java.util.Scanner;

public class Lab167 {
    public static void main(String[] args) {

        //object is created for
        // default constructor and
        // values is passing by separately
        BankAccount bA1= new BankAccount();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String BAname= sc.next();
        System.out.println("Enter your bank code");
        String BAcode = sc.next();
        System.out.println("Enter your balance");
        int bal = sc.nextInt();
        BankAccount bA2=new BankAccount(BAname,BAcode,bal);
        bA2.printDetails();

       bA1.printDetails();

        //System.out.println("------------------------------");
        //object is created for
        //parameterized constructor and
        // values is passing through the constructor




//        System.out.println("Details of bA2 -->" + bA2.name);
//        System.out.println("Details of bA2 -->" + bA2.code);
//        System.out.println("Details of bA2 -->" + bA2.balance);





    }
}
