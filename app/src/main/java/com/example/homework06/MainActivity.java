package com.example.homework06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView signUp;
    EditText name,password;
    Button loginBtn,backBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp=findViewById(R.id.signUp);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);
        backBtn=findViewById(R.id.backBtn);

    loginBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                if (name.getText().toString().equals("clown")
                        && password.getText().toString().equals("password")) {
                    Toast.makeText(MainActivity.this, "Вход выполнен", Toast.LENGTH_SHORT).show();
                    signUp.setVisibility(View.INVISIBLE);
                    name.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    backBtn.setVisibility(View.INVISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
                }
            }}) ;

    }}