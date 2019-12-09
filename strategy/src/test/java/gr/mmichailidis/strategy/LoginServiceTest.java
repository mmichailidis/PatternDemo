package gr.mmichailidis.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void tryLogin() {
        GLogin gLogin = new GLogin();
        FLogin fLogin = new FLogin();

        LoginService loginService = new LoginService(gLogin);

        User michUser = new User("michael", "123", "bla");
        User kirkUser = new User("kirk", "456", "bla");
        User wrongUser = new User("wrong", "fasd", "bla");

        assertTrue(loginService.tryLogin(kirkUser));
        assertFalse(loginService.tryLogin(michUser));
        assertFalse(loginService.tryLogin(wrongUser));

        loginService.setLoginStrategy(fLogin);

        assertFalse(loginService.tryLogin(kirkUser));
        assertTrue(loginService.tryLogin(michUser));
        assertFalse(loginService.tryLogin(wrongUser));
    }
}