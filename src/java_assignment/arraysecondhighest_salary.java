package java_assignment;
import java.util.Scanner;
public class arraysecondhighest_salary {
    public static void main(String[] args) {

        // Ask the user for the length of the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        // Initialize the array with the specified length
        int[] salary = new int[length];

        // Prompt the user to enter the values for the array
        System.out.println("Enter " + length + " values for the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            salary[i] = sc.nextInt();

        }
            //int salary[] = {100};
            int max1 = salary[0];
            int max2 = salary[0];

            for (int i1 = 0; i1 < salary.length; i1++) {
                if (max1 < salary[i1]) {
                    max2=max1;
                    max1 = salary[i1];
                } else if (salary[i1] > max2 && salary[i1] < max1) {
                    max2 = salary[i1];
                }
            }
            System.out.println("The Second highest salary is" + max2);
            //System.out.println(max1);

        }
    }












