package august.Encapsulation;

public class Lab182 {

    private  String name;
    private  long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }

    public Lab182(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
}
