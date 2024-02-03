public class Testargs {
    public static void main(String[] args) { 
        java.io.Console cons = System.console();
        boolean userValid = false;
        if(cons != null){
            String userTyped; String pwdTyped;
            do {
                userTyped = cons.readLine("%s", "User name: ");
                pwdTyped = new String(cons.readPassword("%s", "Password: "));
                if(userTyped.equals("oracle") && pwdTyped.equals("tiger")){
                    userValid = true;
                    System.out.println("User valid");
                } else {
                    System.out.println("Wrong user name/password");
                }
            } while (!userValid);
        }
    }
}
