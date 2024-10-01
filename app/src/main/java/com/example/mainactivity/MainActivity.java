package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    Button buttonClickHere;
    TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText)findViewById(R.id.editTextName);
        buttonClickHere=(Button)findViewById(R.id.buttonClickHere);
        textName=(TextView)findViewById(R.id.textName);

        buttonClickHere.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = editTextName.getText().toString();
                textName.setText("Hi "+name);
            }
        });
    }
}
