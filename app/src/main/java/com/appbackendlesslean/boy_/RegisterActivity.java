package com.appbackendlesslean.boy_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.BackendlessCallback;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnLogin;
    private Button btnRegister;
    private EditText editUsername;
    private EditText editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bindwidget();
        setOnClick();
    }

    private void setOnClick() {
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    private void bindwidget() {
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);
        editUsername = (EditText) findViewById(R.id.edit_username);
        editPassword = (EditText) findViewById(R.id.edit_password);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_login){

        }else if(view.getId() == R.id.btn_register){
            String username = editUsername.getText().toString();
            String password = editUsername.getText().toString();
            //Toast.makeText(this, "USER : " + editUsername.getText().toString() + "\nPASS : " + editPassword.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
