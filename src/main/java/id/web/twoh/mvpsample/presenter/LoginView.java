package id.web.twoh.mvpsample.presenter;

/**
 * Created by Hafizh Herdi on 11/26/2015.
 */
public interface LoginView {
    /**
     * Show validation error.
     */
    void showValidationError();
    /**
     * Login success.
     */
    void loginSuccess();
    /**
     * Login error.
     */
    void loginError();
}