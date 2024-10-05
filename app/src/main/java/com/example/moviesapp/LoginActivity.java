package com.example.moviesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt, passEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        initView();
    }

    private void initView() {
        // Match IDs from the layout file
        userEdt = findViewById(R.id.editTextText);  // Assuming the username EditText has this ID
        passEdt = findViewById(R.id.editTextPassword);  // Assuming the password EditText has this ID
        loginBtn = findViewById(R.id.TextButton);  // Make sure your button ID in XML is 'loginBtn'

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check for empty fields
                if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()) {
                    // Show a toast message if fields are empty
                    Toast.makeText(LoginActivity.this, "Please fill in your username and password", Toast.LENGTH_LONG).show();
                } else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")) {
                    // Intent to navigate to another activity if login is successful
                    Intent intent = new Intent(LoginActivity.this, IntroActivity.class);  // Replace MainActivity with your target activity
                    startActivity(intent);
                } else {
                    // Show a toast message if username or password is incorrect
                    Toast.makeText(LoginActivity.this, "Your username and password are not correct", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private class LoginBtn {
    }
}
