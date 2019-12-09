package gr.mmichailidis.strategy;

public class GLogin implements LoginStrategy{
    public boolean isValid(String username, String password) {
        if (username.equals("kirk") && password.equals("456")) {
            return true;
        }
        return false;
    }
}
