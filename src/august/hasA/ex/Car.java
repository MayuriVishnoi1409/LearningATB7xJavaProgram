package august.hasA.ex;

public class Car {
    void car()
    {
        new Tyre().rolling();
        new Engine().start();
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.car();

    }
}
