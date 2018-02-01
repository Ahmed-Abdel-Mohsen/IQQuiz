package com.example.android.iqquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selected;
    private TextView solutions;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private EditText free_answer;
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
        checkBox1 = (CheckBox) findViewById(R.id.q4_choice1);
        checkBox2 = (CheckBox) findViewById(R.id.q4_choice2);
        checkBox3 = (CheckBox) findViewById(R.id.q4_choice3);
        checkBox4 = (CheckBox) findViewById(R.id.q4_choice4);
        solutions = (TextView) findViewById(R.id.solution_4);
        if (!checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked()) {
            solutions.setText("No Selected Answer");
        } else if (!checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && !checkBox4.isChecked()) {
            solutions.setText("True +1 point");
            score++;
        } else {
            solutions.setText("False");
        }
    }

    private void Question5() {
        free_answer = (EditText) findViewById(R.id.free_answer);
        solutions = (TextView) findViewById(R.id.solution_5);
        if (free_answer.getText().toString().equals("")) {
            solutions.setText("No Selected Answer");
        } else if (free_answer.getText().toString().equals("149.6")) {
            solutions.setText("True +1 point");
            score++;
        } else {
            solutions.setText("False");
        }
    }
}
