package com.example.administrator.androidcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    Button btnOk;
    Spinner spnCourseMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnCourseMenu = (Spinner) findViewById(R.id.spnCourseMenu);
        spnCourseMenu.setSelection(0,true);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(MainActivity.this, Class.forName(
                            "com.example.administrator.androidcourse.Course."
                                    + spnCourseMenu.getSelectedItem())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
