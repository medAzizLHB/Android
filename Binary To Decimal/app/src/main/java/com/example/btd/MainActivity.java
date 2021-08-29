package com.example.btd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText input, output;
        Button submit, reset;


        input = (EditText) findViewById(R.id.editText);
        output = (EditText) findViewById(R.id.output);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = input.getText().toString();

                int i = Integer.parseInt(string, 2);

                String decimal = Integer.toString(i);


                output.setText(decimal);
            }
        });


        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });

    }
}
