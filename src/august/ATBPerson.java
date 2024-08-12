package august;

public class ATBPerson {
    String name;
    long phone;


    // default constructor

       ATBPerson() {
        System.out.println("Object is created");

    }
    // parameter constructor having only String Values

       ATBPerson(String nameGiven) {
          this.name=nameGiven;
    }

    // PC having both values string as well as long

       ATBPerson (String nameGiven , long phoneGiven){
        this.name=nameGiven;
        this.phone=phoneGiven;
    }
}
