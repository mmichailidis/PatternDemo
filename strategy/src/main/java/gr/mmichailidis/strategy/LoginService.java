package gr.mmichailidis.strategy;

public class LoginService {
    private LoginStrategy loginStrategy;

    public LoginService(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public boolean tryLogin(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        String otherField = user.getOtherField();

        System.out.println("Trying login for : " + username + " / " + password);

        boolean isValid = loginStrategy.isValid(username, password);

        if(isValid){
            System.out.println("Credentials were valid");
            return true;
        } else{
            System.out.println("Credentials were invalid");
            return false;
        }
    }
}
