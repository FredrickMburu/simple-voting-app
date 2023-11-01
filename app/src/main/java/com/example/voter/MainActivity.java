package com.example.voter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pepsiText;
    TextView cokeText;
    Button pepsiBtn;
    Button cokeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pepsiText = findViewById(R.id.pepsiText);
        cokeText = findViewById(R.id.cokeText);

        pepsiBtn = findViewById(R.id.pepsiBtn);
        cokeBtn = findViewById(R.id.cokeBtn);

       /* cokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cokeCount = cokeText.getText().toString().trim();
                int count = Integer.parseInt(cokeCount);
                count++;
                cokeText.setText(String.valueOf((int) count));
            }
        });

        pepsiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pepsiCount = pepsiText.getText().toString().trim();
                int count = Integer.parseInt(pepsiCount);
                count++;
                pepsiText.setText(String.valueOf(count));
            }
        });
        */
    }
    public void cokeClick(View v){
        String cokeCount = cokeText.getText().toString().trim();
        int count = Integer.parseInt(cokeCount);
        count++;
        cokeText.setText(String.valueOf(count));

    }

    public void pepsiClick(View v){
        String pepsiCount = pepsiText.getText().toString().trim();
        int count = Integer.parseInt(pepsiCount);
        count++;
        pepsiText.setText(String.valueOf(count));
    }
}