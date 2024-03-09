package io.cucumber.login.actions;

import io.cucumber.login.users.User;

public class LoginAction {

    private final User user;
    private boolean loggedIn;

    public LoginAction(User user) {
        this.user = user;
    }

    public void login(String username, String password) {
        loggedIn = user.login(username, password);
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
