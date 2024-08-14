package august.polymorphinsm.overriding;

public class Lab185 {
    public static void main(String[] args) {
        hound h1=new hound();
        h1.bark();
        dog d1 =new dog();
        d1.bark();
        dog dog_ref =new hound();
        dog_ref.bark();
        //this is not possible because son can not extends father
      //  hound h_reff =new dog();

    }
}
