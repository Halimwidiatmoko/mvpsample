package id.web.twoh.mvpsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.web.twoh.mvpsample.presenter.LoginPresenter;
import id.web.twoh.mvpsample.presenter.LoginPresenterImp;
import id.web.twoh.mvpsample.presenter.LoginView;

/**
 * Created by Hafizh Herdi on 11/26/2015.
 */
public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter presenter;
    private EditText etUsername;
    private EditText etPass;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText) findViewById(R.id.et_username);
        etPass = (EditText) findViewById(R.id.et_pass);
        btLogin = (Button) findViewById(R.id.bt_login);

        presenter = new LoginPresenterImp(this);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(etUsername.getText().toString(), etPass.getText().toString());
            }
        });

    }

    @Override
    public void showValidationError() {
        Toast.makeText(this, "Please enter valid username and password!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "You are successfully logged in!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Invalid login credentials!", Toast.LENGTH_SHORT).show();
    }
}
