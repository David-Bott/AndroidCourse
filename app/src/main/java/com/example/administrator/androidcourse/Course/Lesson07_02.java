package com.example.administrator.androidcourse.Course;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.administrator.androidcourse.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson07_02 extends AppCompatActivity {
    ListView lvLesson07;
    List<String> lesson7List = new ArrayList<String>();
    ArrayAdapter<String> lesson07Adapter;
    Button btnAdd,btnDel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson07_02);
        lesson7List.add("1");
        lesson07Adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,lesson7List);
        lvLesson07 = (ListView) findViewById(R.id.lvLesson07);
        lvLesson07.setAdapter(lesson07Adapter);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lesson7List.add("123");
                lesson07Adapter.notifyDataSetChanged();
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lesson7List.size() > 0) {
                    lesson7List.remove(0);
                    lesson07Adapter.notifyDataSetChanged();
                }
            }
        });
    }
}
