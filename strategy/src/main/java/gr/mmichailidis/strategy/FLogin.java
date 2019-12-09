package gr.mmichailidis.strategy;

public class FLogin implements LoginStrategy {
    public boolean isValid(String username, String password) {
        if (username.equals("michael") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
