package com.example.p005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        setContentView(R.layout.nomain);
        textView.setText("hi");
    }
}
