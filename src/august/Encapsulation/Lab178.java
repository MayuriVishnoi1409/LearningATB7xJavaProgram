package august.Encapsulation;
//encapsulation
public class Lab178 {
    public static void main(String[] args) {
        vwologin1 vwo = new vwologin1("Mauri", "pass123");
//
//        System.out.println(vwo.passwords);
//         vwo.password="123";
//        System.out.println(vwo.password);


    }
}

    class vwologin {
        public String username;
        public  String password;

        public vwologin(String username, String password) {
            this.username = username;
            this.password = password;
        }


    }

