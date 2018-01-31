package com.example.android.iqquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selected;
    private TextView solutions;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
    }

    public void Submit(View view) {
        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Toast.makeText(this, "Score: " + score, Toast.LENGTH_SHORT).show();
        score = 0;
    }

    private void Question1() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_1);
        solutions = (TextView) findViewById(R.id.solution_1);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            solutions.setText("No Selected Answer");
        } else {
            selected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (selected.getText().equals("312")) {
                solutions.setText("True +1 point");
                score++;
            } else {
                solutions.setText("False");
            }
        }
    }

    private void Question2() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_2);
        solutions = (TextView) findViewById(R.id.solution_2);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            solutions.setText("No Selected Answer");
        } else {
            selected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (selected.getText().equals("1")) {
                solutions.setText("True +1 point");
                score++;
            } else {
                solutions.setText("False");
            }
        }
    }

    private void Question3() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_3);
        solutions = (TextView) findViewById(R.id.solution_3);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            solutions.setText("No Selected Answer");
        } else {
            selected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (selected.getText().equals("36")) {
                solutions.setText("True +1 point");
                score++;
            } else {
                solutions.setText("False");
            }
        }
    }

    private void Question4() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_4);
        solutions = (TextView) findViewById(R.id.solution_4);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            solutions.setText("No Selected Answer");
        } else {
            selected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (selected.getText().equals("3")) {
                solutions.setText("True +1 point");
                score++;
            } else {
                solutions.setText("False");
            }
        }
    }

    private void Question5() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_5);
        solutions = (TextView) findViewById(R.id.solution_5);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            solutions.setText("No Selected Answer");
        } else {
            selected = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (selected.getText().equals("720")) {
                solutions.setText("True +1 point");
                score++;
            } else {
                solutions.setText("False");
            }
        }
    }
}
