package com.example.hamza.gretquizapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class shugl extends AppCompatActivity {

    private Button button;
    private TextView text_view_new_questions;
    private TextView text_view_no_questions;
    private TextView text_view_Score;
    private TextView text_view_countdown;
    private int count = -1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private int score = 0;
    private int question = 1;
    private boolean click=false;
    private int a=0;
    private int b;
    private static final long COUNTDOWN_IN_MILLIS = 30000;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    String name;
    String surname;
    public shugl()
    {

    }
    public  shugl(String name,String surname)
    {
        this.name=name;
        this.surname=surname;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shugl);
        button = (Button) findViewById(R.id.button_submit);
        text_view_new_questions = (TextView) findViewById(R.id.text_view_questioning);
        text_view_no_questions = (TextView) findViewById(R.id.text_view_question);
        text_view_Score = (TextView) findViewById(R.id.text_view_score);
        text_view_countdown=(TextView) findViewById(R.id.text_view_countdown);
        rb1 = (RadioButton) findViewById(R.id.radio_button1);
        rb2 = (RadioButton) findViewById(R.id.radio_button2);
        rb3 = (RadioButton) findViewById(R.id.radio_button3);
        timer();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=1;
                b++;
                timer();
                count++;
                question++;
                dothis();
                // b=2;
            }
        });
    }

    public void dothis() {
        if (count == 0) {
            //timer();
            checking();
            text_view_new_questions.setText("who is prime minister of india");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("Moodi");
            rb2.setText("Singh");
            rb3.setText("Kohli");
        }
        if (count == 1) {
            //timer();
            checking();
            text_view_new_questions.setText("who is pakistani cricketer");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("Moodi");
            rb2.setText("afridi");
            rb3.setText("Kohli");
        }
        if (count == 2) {
            //timer();
            checking();
            text_view_new_questions.setText("who is boom boom");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("akmal");
            rb2.setText("afridi");
            rb3.setText("zaheer");
        }
        if (count == 3) {
            //timer();
            checking();
            text_view_new_questions.setText("who is prime minister of america");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("donald");
            rb2.setText("bush");
            rb3.setText("Kohli");
        }
        if (count == 4) {
            //timer();
            checking();
            text_view_new_questions.setText("Our android teacher name is:");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("Sir Aqil");
            rb2.setText("bush");
            rb3.setText("atiq");
        }
        if (count == 5) {
            //timer();
            checking();
            text_view_new_questions.setText("Our compiler teacher is:");
            text_view_no_questions.setText("Question: " + question + "/5");
            rb1.setText("Sir Kashif");
            rb2.setText("Sir Atiq");
            rb3.setText("Kohli");
        }
        if (count == 6) {
            checking();
        }
        if (count >= 7) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No more questions avaiable and your score is:" + score,
                    Toast.LENGTH_SHORT);

            toast.show();
        }
    }

    public void checking() {
        if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked()) {
            scoreCheck();
            text_view_Score.setText("Score: " + score);
            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
        }
    }

    public void scoreCheck() {
        if (count == 0 && rb1.isChecked()) {
            score = score + 10;
        }
        if (count == 1 && rb1.isChecked()) {
            score = score + 10;
        }
        if (count == 2 && rb2.isChecked()) {
            score = score + 10;
        }
        if (count == 3 && rb2.isChecked()) {
            score = score + 10;
        }
        if (count == 4 && rb1.isChecked()) {
            score = score + 10;
        }
        if (count == 5 && rb1.isChecked()) {
            score = score + 10;
        }
        if (count == 6 && rb1.isChecked()) {
            score = score + 10;
        }
    }
    public void timer()
    {
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                text_view_countdown.setText("" + millisUntilFinished / 1000);

            }

            public void onFinish() {

            }
        }.start();

    }
}
