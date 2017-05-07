package com.example.administrator.androidcourse.Course;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.androidcourse.R;

public class Lesson04 extends AppCompatActivity {
    Button btnOne,btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson04);
        btnOne = (Button) findViewById(R.id.btn401);
        btnTwo = (Button) findViewById(R.id.btn402);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
        btnTwo.setOnClickListener(ocl);
    }

    View.OnClickListener ocl = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showDialog();
        }
    };

    private void showDialog() {
        new AlertDialog.Builder(Lesson04.this)
                .setTitle("Listener")
                .setMessage(R.string.lesson_04)
                .setPositiveButton("Positive",null)
                .show();
    }
}
