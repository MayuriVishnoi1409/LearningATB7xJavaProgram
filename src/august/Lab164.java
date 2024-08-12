package august;

public class Lab164 {
    public static void main(String[] args) {
       // constructor can be call many times
       //or created any no. of object with a keyword new

        car c1 = new car();
        //here object is created but no one is pointing to them
        //due to no reference is is pointing to the new object
        new car();
        new car();
        car c2 = new car ();



    }
}
