package gr.mmichailidis.strategy;

public class User {
    private String username;
    private String password;
    private String otherField;

    public User(String username, String password, String otherField) {
        this.username = username;
        this.password = password;
        this.otherField = otherField;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtherField() {
        return otherField;
    }

    public void setOtherField(String otherField) {
        this.otherField = otherField;
    }
}
