package august.Encapsulation;

public class Lab181 {
    public static void main(String[] args) {
        vwologinpage vwp = new vwologinpage("admin", "12345");
        System.out.println(vwp.getName());
    }
}

    class vwologinpage
    {  //data member
        private String name;
        private String pwd;

        public String getName() {
            return name;
        }


        public vwologinpage(String name, String pwd) {
            this.name = name;
            this.pwd= pwd;

        }
    }

