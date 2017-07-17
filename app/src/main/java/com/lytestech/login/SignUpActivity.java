package com.lytestech.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONObject;

/**
 * Created by gideon bamuleseyo on 5/11/2017.
 */

public class SignUpActivity extends AppCompatActivity {
    EditText etName, etUserName, etPassword;
    Button bRegister;
    String mName, mUserName, mPassword, mEmail;
    AQuery aq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        aq = new AQuery(this);
        etName = (EditText) findViewById(R.id.edit_txt_name);
        etUserName = (EditText) findViewById(R.id.edit_txt_username);
        etPassword = (EditText) findViewById(R.id.edit_txt_password);
        bRegister = (Button) findViewById(R.id.btn_register);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }

    private void register(){
        mName = etName.getText().toString();
        mUserName = etUserName.getText().toString();
        mPassword = etPassword.getText().toString();
        mEmail = aq.id(R.id.edit_txt_email).getText().toString();

        String url = "http://lytestech.ga/api/lytes/register";
        url += "?myname=" + mName  + "&email=" + mEmail +  "&username=" + mUserName + "&password=" + mPassword;
        aq.ajax(url, String.class, new AjaxCallback<String>(){
            @Override
            public void callback(String url, String response, AjaxStatus status) {
                Toast.makeText(SignUpActivity.this, response, Toast.LENGTH_LONG).show();
            }
        });
    }
}
