package java_assignment;
import java.util.Scanner;
public class arraysecondhighest_salary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salary[0] = sc.nextInt();
        //int salary[] = {100};
        int max1 = salary[0];
        int max2= salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (max1 < salary[i]){
                max1 = salary[i];
        } else if ( salary[i] > max2 && salary[i] <max1 ) {
              max2=salary[i];
            }
        }
        System.out.println(max2);
        System.out.println(max1);

        }

        }







