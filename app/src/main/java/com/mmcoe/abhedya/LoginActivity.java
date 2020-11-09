package com.mmcoe.abhedya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private int attempt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.edit_text_user);
        Password = findViewById(R.id.edit_text_pass);
        final Button button_start = findViewById(R.id.button_start);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences vPref = getApplicationContext().getSharedPreferences("com.mmcoe.abhedya.MyPref", 0); // 0 - for private mode
                if (vPref.contains("isAttempted")) {
                    attempt = 1;
                }
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate (String userName, String passWord) {
        if ((userName.equals("Participant")) && (passWord.equals("Agni64"))) {
            if (attempt == 1) {
                Toast.makeText(this, "Test already attempted", Toast.LENGTH_SHORT).show();
            } else {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("com.mmcoe.abhedya.MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();
                editor.putInt("isAttempted", 1);
                editor.apply();
                Intent intent = new Intent(LoginActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        } else if ((userName.equals("Master")) && (passWord.equals("bitepenguin"))) {
            Intent intent = new Intent(LoginActivity.this,QuizActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Please enter a valid username and password", Toast.LENGTH_SHORT).show();
        }
    }
}
