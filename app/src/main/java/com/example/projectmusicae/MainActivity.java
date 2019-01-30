package com.example.projectmusicae;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void nextActivity(View view) {
        Intent intent = new Intent(this, TabbedActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView6);
        startActivity(intent);
    }

}
