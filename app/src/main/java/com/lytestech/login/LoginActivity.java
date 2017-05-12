package com.lytestech.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by gideon bamuleseyo on 4/11/2017.
 */

public class LoginActivity extends AppCompatActivity {
    EditText etUserName, etPassword;
    Button bLogin, bGotoRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName= (EditText) findViewById(R.id.edit_txt_username);
        etPassword= (EditText) findViewById(R.id.edit_txt_password);
        bLogin= (Button) findViewById(R.id.btn_login);
        bGotoRegister= (Button) findViewById(R.id.btn_goto_register);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

        bGotoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });
    }
}
