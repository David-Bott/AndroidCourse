package com.example.administrator.androidcourse.Course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.androidcourse.R;

public class Lesson05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson05);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lesson05,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this,Lesson05_2.class);
        switch (item.getItemId()) {
            case R.id.item_one:
                startActivity(intent);
                break;
            case R.id.item_two:
                intent.putExtra("Lesson5",getResources().getString(R.string.lesson_05Message));
                startActivity(intent);
                break;
            default:
                break;
        }
        return true;
    }
}
