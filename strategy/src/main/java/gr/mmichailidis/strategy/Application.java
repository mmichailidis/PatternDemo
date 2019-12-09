package gr.mmichailidis.strategy;

public class Application {
    public static void main(String[] args) {
        GLogin gLogin = new GLogin();
        FLogin fLogin = new FLogin();

        LoginService loginService = new LoginService(gLogin);

        User michUser = new User("michael", "123", "bla");
        User kirkUser = new User("kirk", "456", "bla");
        User wrongUser = new User("wrong", "fasd", "bla");

        boolean firstTry = loginService.tryLogin(michUser);

        if (firstTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }

        boolean secondTry = loginService.tryLogin(kirkUser);

        if (secondTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }

        boolean thirdTry = loginService.tryLogin(wrongUser);

        if (thirdTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }

        loginService.setLoginStrategy(fLogin);

        boolean forthTry = loginService.tryLogin(michUser);

        if (forthTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }

        boolean fifthTry = loginService.tryLogin(kirkUser);

        if (fifthTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }

        boolean sixthTry = loginService.tryLogin(wrongUser);

        if (sixthTry) {
            System.out.println("Login was success");
        } else {
            System.out.println("Login was fail");
        }
    }
}
