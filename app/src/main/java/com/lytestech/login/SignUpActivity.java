package com.lytestech.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by gideon bamuleseyo on 5/11/2017.
 */

public class SignUpActivity extends AppCompatActivity {
    EditText etName, etUserName, etPassword;
    Button bRegister;
    String mName, mUserName, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etName = (EditText) findViewById(R.id.edit_txt_name);
        etUserName = (EditText) findViewById(R.id.edit_txt_username);
        etPassword = (EditText) findViewById(R.id.edit_txt_password);
        bRegister = (Button) findViewById(R.id.btn_register);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mName = etName.getText().toString();
                mUserName = etUserName.getText().toString();
                mPassword = etPassword.getText().toString();
                String method = "register";
                BackgroundTask backgroundtask = new BackgroundTask(SignUpActivity.this);
                backgroundtask.execute(method, mName, mUserName, mPassword);
            }
        });

    }
}
