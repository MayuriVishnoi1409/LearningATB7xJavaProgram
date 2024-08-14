package august.polymorphinsm.overloading;

public class Lab184 {
    public static void main(String[] args) {
        MathOperation mathopr=new MathOperation();
         int result = mathopr.add(2,4);
         double result1=mathopr.add(2.3,3.4,3);
         String result2 = mathopr.add("mayuri","vishnoi");
         System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
