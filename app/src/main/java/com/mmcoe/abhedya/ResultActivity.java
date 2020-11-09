package com.mmcoe.abhedya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textViewScore = findViewById(R.id.text_view_final_score);
        textViewScore.setText(QuizActivity.score + "/" + "50");
        Toast.makeText(this,"Stay tuned for future updates !!",Toast.LENGTH_LONG).show();
    }
}
