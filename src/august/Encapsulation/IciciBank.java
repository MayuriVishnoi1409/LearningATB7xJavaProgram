package august.Encapsulation;

public class IciciBank {
    // Data member
    private String userName;
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName, boolean isAdmin) {
        if (isAdmin) {

            System.out.println("Allowed");

            this.userName = userName;
        } else {
            System.out.println("not allowed");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd, boolean isAdmin) {
        if (isAdmin) {
            System.out.println("Allowed");
            this.pwd = pwd;
        } else {
            System.out.println("not allowed");
        }
    }

    // PC
    public IciciBank(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
        //Getter and Setter

    }
}







