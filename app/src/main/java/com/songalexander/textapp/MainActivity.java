package com.songalexander.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;
    Button submit_button;
    EditText text_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.label);
        submit_button = findViewById(R.id.title_button);
        text_box = findViewById(R.id.enter_name);
        submit_button.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            @Override
            public void onClick(View v) {
                //change append name onto label
                Resources res = getResources();
                String[] messages = res.getStringArray(R.array.messages);
                title.setText(messages[i%messages.length]+text_box.getText());
                i++;
            }
        });

    }
}