package com.example.administrator.androidcourse.Course;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.androidcourse.R;

public class Lesson07 extends AppCompatActivity {
    EditText edtAdm,edtPw;
    Button btnLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson07);
        edtAdm = (EditText) findViewById(R.id.edtUserName);
        edtPw = (EditText) findViewById(R.id.edtUserPassword);
        btnLogIn = (Button) findViewById(R.id.btnLoIn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (isConnected()) {
                        if (edtAdm.getText().toString().equals("admin") && edtPw.getText().toString().equals("123456")) {
                            startActivity(new Intent(Lesson07.this,Lesson07_02.class));
                        } else {
                            Toast.makeText(Lesson07.this, R.string.log_in_failed, Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception ex) {
                    Toast.makeText(Lesson07.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isConnected(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni != null && ni.isConnected()) {
            return true;
        }
        return false;
    }
}
