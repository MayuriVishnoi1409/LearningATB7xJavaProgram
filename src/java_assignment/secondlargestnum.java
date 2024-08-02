package java_assignment;
import  java.util.Scanner;
public class secondlargestnum {
    public static void main(String[] args) {

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the First number 1");
        int num1 = sc1.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter the Second number 2");
        int num2 = sc2.nextInt();

        Scanner sc3= new Scanner(System.in);
        System.out.println("Enter the Third number 3");
        int num3 = sc3.nextInt();

            if (num1 > num2 && num1 > num3)
            {
                if (num2 > num3)
                {
                    System.out.println("Number2 is second largest number "+num2);
                }
                else if (num3 > num2)
                {
                    System.out.println("Number3 is second largest number "+num3);
                }

            }
            else
            {
             System.out.println("Number1 is second largest number "+num1);
            }
        }
    }








