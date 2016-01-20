package com.example.activity.chapter08_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioSexButton;
    RadioGroup radioGroup;
    Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        btnDisplay = (Button) findViewById(R.id.btndisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idButtonChecked = radioGroup.getCheckedRadioButtonId();
                radioSexButton = (RadioButton) findViewById(idButtonChecked);
                Toast.makeText(MainActivity.this, radioSexButton.getText().toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
