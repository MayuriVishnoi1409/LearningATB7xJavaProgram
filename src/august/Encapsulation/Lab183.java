package august.Encapsulation;

import java.util.Scanner;

public class Lab183 {
    public static void main(String[] args) {
        IciciBank admin1=new IciciBank("admin","pwd123");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of User Name");
        String uName=sc.next();
        System.out.println(uName);
        if (uName.equals("admin")) {
            System.out.println("allowed");
            admin1.setUserName("amit",true);
        }
        else {
            System.out.println("not allowed");
        }


//
//       System.out.println(admin1.getUserName());
//
//       System.out.println(admin1.getPwd());


    }
}
