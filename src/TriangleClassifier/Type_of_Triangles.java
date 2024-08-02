package TriangleClassifier;
import java.util.Scanner;

public class Type_of_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side 1");
        int side1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of side 2");
        int side2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the value of side 3");
        int side3 = sc2.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("The Triangle is equilateral");
        }
        if (side1 == side2 && side2 != side3)
        {
            System.out.println("The Triangle is isoceles");

        }
        if (side1 != side2 && side2 != side3)
        {
            System.out.println("The triangle is scalene");


        }

        sc.close();
        sc1.close();
        sc2.close();

        }
    }




