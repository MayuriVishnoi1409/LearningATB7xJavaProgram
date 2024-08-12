package august;

public class Lab166 {
    public static void main(String[] args) {
        //String NameGiven;

        //object is created p1,p2,p3
        ATBPerson p0=new ATBPerson();
        ATBPerson p1= new ATBPerson("promode");
        ATBPerson p2= new ATBPerson("Amit",   964673478 );
        ATBPerson p3=new ATBPerson("harshal");
         // p1.name="amit";
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p2.name);
        System.out.println(p2.phone);
        System.out.println(p3.name);
        System.out.println(p0.name);
        System.out.println(p0.phone);


    }
}
