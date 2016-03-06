package id.web.twoh.mvpsample.presenter;

import android.text.TextUtils;

/**
 * Created by Hafizh Herdi on 11/26/2015.
 */
public class LoginPresenterImp implements LoginPresenter {
    /**
     * The login view.
     */
    private LoginView loginView;

    /**
     * Instantiates a new login presenter impl.
     *
     * @param loginView the login view
     */
    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            loginView.showValidationError();
        } else {
            if (username.equals("admin") && password.equals("admin")) {
                loginView.loginSuccess();
            } else {
                loginView.loginError();
            }
        }
    }
}
