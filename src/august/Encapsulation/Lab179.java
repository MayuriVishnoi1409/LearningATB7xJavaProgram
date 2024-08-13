package august.Encapsulation;


// fixed encapsulation


public class Lab179 {
    public static void main(String[] args) {
        vwologin1 vwo = new vwologin1("admin", "pass123");
        System.out.println(vwo.getUsername());
        System.out.println(vwo.getPassword());


        vwo.setUsername("amit");
        vwo.setPassword("123456", false);
        System.out.println(vwo.getUsername());
        System.out.println(vwo.getPassword());
    }
    }
        class vwologin1 {
    //  data members are user name and password and these data members are controlled by the
            //getter and  setter like father and mother because data member are private in nature
            // and getter setter anr public in nature

        private String username;
        private String password;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password,boolean isauthentic) {

                this.password = password;
                if (isauthentic)
                {
                    System.out.println("allow to enter");
                }
                else {
                    System.out.println("not allow");
                }
            }

        public vwologin1(String username, String password) {
            this.username = username;
            this.password = password;
        }


    }

