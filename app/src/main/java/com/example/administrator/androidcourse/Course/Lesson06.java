package com.example.administrator.androidcourse.Course;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.androidcourse.R;

public class Lesson06 extends AppCompatActivity {
    ListView listViewLesson06;
    String[] lesson6List = {"1","2","3","4","5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson06);
        showDialog();
        listViewLesson06 = (ListView) findViewById(R.id.lvLesson06);
        listViewLesson06.setAdapter(new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,lesson6List));
        listViewLesson06.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Lesson06.this, lesson6List[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showDialog() {
        new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage(R.string.lesson_06)
                .setPositiveButton("OK",null)
                .show();
    }
}
