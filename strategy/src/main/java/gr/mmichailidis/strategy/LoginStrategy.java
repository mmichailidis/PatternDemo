package gr.mmichailidis.strategy;

public interface LoginStrategy {
    boolean isValid(String username, String password);
}
