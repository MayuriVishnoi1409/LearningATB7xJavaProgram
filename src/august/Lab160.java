package august;

import javax.naming.Name;
import java.util.Scanner;

public class Lab160 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String Name1 = sc.next();
        System.out.println("Bank balance");
        int Balance1 = sc.nextInt();
        Bank Ba = new Bank(Name1, Balance1);
        Ba.printDetails();

        sc.close();
    }

}
