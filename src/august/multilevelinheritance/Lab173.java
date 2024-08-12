package august.multilevelinheritance;

public class Lab173 {
    public static void main(String[] args) {
        //multi level inheritance

        child c1= new child();
        c1.home2();
        c1.HOme();
        c1.Home();

        father f1= new father();
        f1.HOme();
        f1.Home();

        grandfather gf= new grandfather();
        gf.Home();
    }
}
