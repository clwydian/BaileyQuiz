package com.example.android.quiztask;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //    some integers to hold the question answers for checking later - checkbox answers are effectively true/false
    int score = 0;
    int q1, q2, q3a, q3d, q3e, q3f, q4, q5, q6 = 0;
    // and an ignored checkbox is sometimes correct but the java doesnt get to see it
    int q3b = 1;
    int q3c = 1;

    // this checks the answer for question 1, a radio button array
    public void onRadioButton1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1a:
                if (checked)
                    // question1 1a selected if correct then q1 == wrong
                    q1 = 0; // wrong
//                Log.d("onradiobutton1", "q1 answered as a " + q1);

                break;
            case R.id.q1b:
                if (checked)
                    // question1 1b
                    q1 = 1;  //right
//                Log.d("onradiobutton1", "q1 answred as b " + q1);
                break;
            case R.id.q1c:
                if (checked)
                    // question 1c
                    q1 = 0;  //wrong
//                Log.d("onradiobutton1", "q1 answered as c  " + q1);
                break;

        }
    }


    // this checks the answer for question 2 a radio button array
    public void onRadioButton2Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2a:
                if (checked)
                    // question 2a selected if correct then q2 wrong
                    q2 = 0; // wrong

                break;
            case R.id.q2b:
                if (checked)
                    // question1 b
                    q2 = 0;  //wrong
                break;
            case R.id.q2c:
                if (checked)
                    // question 1 c
                    q2 = 1;  //right
                break;

        }
    }


    //    This runs though q3 checkboxes adding to the score for the correct answers TFFTTT
    //    A correct answer is stored as 1 an incorrect as 0
    //    This code gets the score from the checkboxes as they are 'checked' and stores them (they zero on initalisaing)

    public void onCheckbox3x1(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x1);
        if (checkBoxTemp.isChecked()) {
            q3a = 1;
        } else {
            q3a = 0;
        }
//        Log.d("checkbox1", " answered as " + q3a);

    }

    public void onCheckbox3x2(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x2);
        if (checkBoxTemp.isChecked()) {
            q3b = 0;
        } else {
            q3b = 1;
        }
//        Log.d("checkbox2", " answered as " + q3b);

    }

    public void onCheckbox3x3(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x3);
        if (checkBoxTemp.isChecked()) {
            q3c = 0;
        } else {
            q3c = 1;
        }
//        Log.d("checkbox3", " answered as " + q3c);

    }

    public void onCheckbox3x4(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x4);
        if (checkBoxTemp.isChecked()) {
            q3d = 1;
        } else {
            q3d = 0;
        }
//        Log.d("checkbox4", " answered as " + q3d);

    }

    public void onCheckbox3x5(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x5);
        if (checkBoxTemp.isChecked()) {
            q3e = 1;
        } else {
            q3e = 0;
        }
//        Log.d("checkbox5", " answered as " + q3e);

    }

    public void onCheckbox3x6(View view) {
        CheckBox checkBoxTemp = findViewById(R.id.q3x6);
        if (checkBoxTemp.isChecked()) {
            q3f = 1;
        } else {
            q3f = 0;
        }
//        Log.d("checkbox6", " answered as " + q3f);

    }

        //    radio buttons question4
        //    this checks the answer for question 4 a radio button array
    public void onRadioButton4Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4a:
                if (checked)
                    // question 4a
                    q4 = 0; // wrong

                break;
            case R.id.q4b:
                if (checked)
                    // question  4b
                    q4 = 1;  //right
                break;
            case R.id.q4c:
                if (checked)
                    // question 4c
                    q4 = 0;  //wrong
                break;

        }
    }

    // radio buttons questions five
    // this checks the answer for question 5 a radio button array
    public void onRadioButton5Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5a:
                if (checked)
                    // question 5a
                    q5 = 0; // wrong

                break;
            case R.id.q5b:
                if (checked)
                    // question 5b
                    q5 = 0;  //wrong
                break;
            case R.id.q5c:
                if (checked)
                    // question 5c
                    q5 = 1;  //right
                break;

        }
    }

    //readio buttons question six
    // this checks the answer for question 2 a radio button array
    public void onRadioButton6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q6a:
                if (checked)
                    // question 6a
                    q6 = 0; // wrong

                break;
            case R.id.q6b:
                if (checked)
                    // question 6b
                    q6 = 0;  //wrong
                break;
            case R.id.q6c:
                if (checked)
                    // question 6c
                    q6 = 1;  //right
                break;

        }
    }


    //This is the 'how did i do' button evaluation
    public void onButtonClick(View view) {
        //start with no score each time the button is pressed just to be sure
        score = 0;

        //        Then just add up the variables (ok an array would have been better but I dont know how yet)
        score = q1 + q2 + q3a + q3b + q3c + q3d + q3e + q3f + q4 + q5 + q6;

        //        we address our customer by name as we build the result string
        String scoremsg;
        String customer_name;

        TextView myNameIs = findViewById(R.id.customer_name);
        customer_name = myNameIs.getText().toString();
        scoremsg = "Hello " + customer_name;
        scoremsg = scoremsg + "\nYour score is" + score + "out of 11";

// a different message is needed if a full score of 11 has been acheived
        if (score == 11) {
            scoremsg = scoremsg + "\n*** FABULOUS FULL MARKS ***\nI do appreciate the effort!  ";
        } else {
            scoremsg = scoremsg + "\nYou can always scroll back and make changes?";
        }
        Log.d("all the scoreds ", " 1:" + q1 + " 2:" + q2 + " 3a:" + q3a + " 3b:" + q3b + " 3c:" + q3c + " 3d:" + q3d + " 3e:" + q3e + " 3f:" + q3f);

        // and we poke a message at them
        Context context = getApplicationContext();
        CharSequence text = scoremsg;
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 20, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

// then add a little to the scoremessage
        scoremsg = scoremsg + "\n\nswipe up for more...";
        // And lets go to print!
        TextView resultsfield = (TextView) findViewById(R.id.resultsfield);
        resultsfield.setText(scoremsg);


// the idea is that people go back until pressing evaluate gives them max points


    }

}


