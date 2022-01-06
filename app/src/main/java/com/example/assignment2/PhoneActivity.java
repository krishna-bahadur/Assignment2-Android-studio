package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity {
    Button send;
    EditText inputNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        send = findViewById(R.id.btnSend);
        inputNum = findViewById(R.id.inputNum);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                String result = inputNum.getText().toString();
                i.putExtra("result",result);
                setResult(RESULT_OK,i);
                finish();

            }
        });

    }
}