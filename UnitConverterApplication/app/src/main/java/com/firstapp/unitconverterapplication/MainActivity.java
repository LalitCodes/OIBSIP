package com.firstapp.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaring Widgets
    EditText editTexts;
    TextView textView, textView2, textView4 , ValueOfPounds;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating Widgets
        //textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        ValueOfPounds = findViewById(R.id.ValueOfPounds);
        editTexts  = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        // Adding A Click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                // Calling ConvertFromKiloToPound Method

                ConvertFromKiloFound();

            }
        });
}

    private void ConvertFromKiloFound() {
        String value = editTexts.getText().toString();
        double Kilo = Double.parseDouble(value);
        double pounds = Kilo * 2.205;
        ValueOfPounds.setText("" + pounds);
    }
    }