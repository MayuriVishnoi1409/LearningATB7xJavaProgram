package ex_27072024;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        int[] salary = {23, 34, 13, 8, 45, 76, 3, 50};
        int max=1;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max)
                max= salary[i] ;

            }
System.out.println("the maimum salary is" +max);
        }
       // int max = Arrays.stream(salary).filter(j -> j >= 1).max().orElse(1);


        //these two lines to use how to find out max salary from the array
//        Arrays.sort(salary);
//        System.out.println(salary[salary.length -1]);
    }


