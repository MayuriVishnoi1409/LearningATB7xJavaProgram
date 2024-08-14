package august.polymorphinsm.overloading;

public class MathOperation {
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b,int c)
    {
        return a+b+c;
    }
    String add(String a,String b )
    {
        return a+b;
    }
}
