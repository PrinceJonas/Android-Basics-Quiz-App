//Author: Prince Jonas
//Name: Android Basics Quiz App
package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * @param userSore is a global variable used to keep track of the quiz score
     */
    int userScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * response function for question 1
     * @param view question 1
     */
    public void onQuestionOneClick(View view){
        int answer_id = R.id.que_one_ans_three;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 2
     * @param view question 2
     */
    public void onQuestionTwoClick(View view){
        int answer_id = R.id.que_two_ans_three;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 3
     * @param view question 3
     */
    public void onQuestionThreeClick(View view){
        int answer_id = R.id.que_three_ans_three;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 4
     * @param view question 4
     */
    public void onQuestionFourClick(View view){
        int answer_id = R.id.que_four_ans_one;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 5
     * @param view question 5
     */
    public void onQuestionFiveClick(View view){
        int answer_id = R.id.que_five_ans_two;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 6
     * @param view question 6
     */
    public void onQuestionSixClick(View view){
        int answer_id = R.id.que_six_ans_one;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 7
     * @param view question 7
     */
    public void onQuestionSevenClick(View view){
        int answer_id = R.id.que_seven_ans_one;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 8
     * @param view question 8
     */
    public void onQuestionEightClick(View view){
        int answer_id = R.id.que_eight_ans_one;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 9
     * @param view question 9
     */
    public void onQuestionNineClick(View view){
        int answer_id = R.id.que_nine_ans_one;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * response function for question 10
     * @param view question 10
     */
    public void onQuestionTenClick(View view){
        int answer_id = R.id.que_ten_ans_two;
        int pressed_id = view.getId();
        scoreCalculator(answer_id, pressed_id);
    }

    /**
     * This function computes the score by comparing the correct answer and the user's answer
     * @param ans_id correct answer resId
     * @param user_id user's answer resId
     */
    public void scoreCalculator(int ans_id, int user_id){
        if(ans_id==user_id){
            userScore += 1;
        }
    }

    /**
     * response function the submit and grade button
     * @param view the button view
     */
    public void submitAndGrade(View view){

        EditText userNameInput = findViewById(R.id.user_name_input);
        String userName = userNameInput.getText().toString();

        CheckBox quizCompletionCheckBox = (CheckBox) findViewById(R.id.quiz_completion_checkbox);
        boolean quizCompleted = quizCompletionCheckBox.isChecked();

        //Checking if quiz completion checkbox is checked
        if(quizCompleted){
            Context context = getApplicationContext();
            String toastText = "Thank you for completing the quiz " + userName ;
            toastText+= ". You scored: " + userScore + " out of 10!";
            int duration = Toast.LENGTH_LONG;
            Toast toastMessage = Toast.makeText(context, toastText, duration);
            toastMessage.show();
        }

        //If checkbox is not checked
        else{
            Context context = getApplicationContext();
            String toastText = "You have not answered all the questions";
            int duration = Toast.LENGTH_LONG;
            Toast toastMessage = Toast.makeText(context, toastText, duration);
            toastMessage.show();
        }

    }
}
