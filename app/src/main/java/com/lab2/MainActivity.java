package com.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.cst3104041093261.R;
import com.google.android.material.snackbar.Snackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //display message when button is clicked
                Toast.makeText(getApplicationContext(), R.string.toast_message,Toast.LENGTH_LONG).show();

            }
        });

        CheckBox checkBox = findViewById(R.id.checkBox);
        SwitchCompat switchBox = findViewById(R.id.switchBox);

        switchBox.setOnCheckedChangeListener((btn1, onOrOff) -> {
            String toDisplay = "The switch is now";
            if (switchBox.isChecked()){toDisplay += " on";}
            else {toDisplay += " off";}
            Snackbar snackbar = Snackbar.make(switchBox, toDisplay,Snackbar.LENGTH_LONG)
                    .setAction(R.string.undo, click -> switchBox.setChecked(!onOrOff));
            snackbar.show();
        });


    }
}