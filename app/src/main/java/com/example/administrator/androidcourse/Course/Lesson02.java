package com.example.administrator.androidcourse.Course;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.administrator.androidcourse.R;

public class Lesson02 extends AppCompatActivity {
    Spinner spnShow;
    TableRow tabLinear,tabRelative,tabFrame,tabAbsolute;
    TextView txtExplanation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson02);
        final String[] layouts = {"LinearLayout", "RelativeLayout", "FrameLayout", "AbsoluteLayout"};
        ArrayAdapter<String> layoutAdapter = new ArrayAdapter<String>(Lesson02.this,R.layout.support_simple_spinner_dropdown_item,layouts);
        tabLinear = (TableRow) findViewById(R.id.tabRowLinear);
        tabRelative = (TableRow) findViewById(R.id.tabRowRelative);
        tabFrame = (TableRow) findViewById(R.id.tabRowFrame);
        tabAbsolute = (TableRow) findViewById(R.id.tabRowAbsolute);
        txtExplanation = (TextView) findViewById(R.id.txtExplanation);
        spnShow = (Spinner) findViewById(R.id.spnShowLayout);
        spnShow.setAdapter(layoutAdapter);
        spnShow.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectLayout(position);
//                Toast.makeText(Lesson02.this, layouts[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void selectLayout(int position) {
        tabLinear.setVisibility(View.GONE);
        tabRelative.setVisibility(View.GONE);
        tabFrame.setVisibility(View.GONE);
        tabAbsolute.setVisibility(View.GONE);
        switch (position) {
            case 0:
                txtExplanation.setText(R.string.linear_explanation);
                tabLinear.setVisibility(View.VISIBLE);
                break;
            case 1:
                txtExplanation.setText(R.string.relitive_explanation);
                tabRelative.setVisibility(View.VISIBLE);
                break;
            case 2:
                txtExplanation.setText(R.string.frame_explanation);
                tabFrame.setVisibility(View.VISIBLE);
                break;
            case 3:
                txtExplanation.setText(R.string.absolute_explanation);
                tabAbsolute.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }
}
