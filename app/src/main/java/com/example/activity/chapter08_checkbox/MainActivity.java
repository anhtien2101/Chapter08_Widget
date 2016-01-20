package com.example.activity.chapter08_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbxAndroid, cbxIPhone, cbxWindow;
    Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbxAndroid = (CheckBox) findViewById(R.id.cbxAndroid);
        cbxIPhone = (CheckBox) findViewById(R.id.cbxIPhone);
        cbxWindow = (CheckBox) findViewById(R.id.cbxWindow);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        addListenerIOsClick();
        addListenerOnButton();


    }

    public void addListenerIOsClick(){
        cbxIPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbxIPhone.isChecked()) {
                    Toast.makeText(MainActivity.this, "Bro, try Android", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addListenerOnButton(){
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("IPhone check: ").append(cbxIPhone.isChecked());
                result.append("\n Android check: ").append(cbxAndroid.isChecked());
                result.append("\n Windows Phone check: ").append(cbxWindow.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
