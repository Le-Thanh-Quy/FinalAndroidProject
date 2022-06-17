package com.quy.finalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    RelativeLayout add_note_frame, add_new_note, note2, note21;
    TextView them, abc1, abc11, huy, haha1, haha, haha22;
    EditText text1, text2;
    boolean isFirst = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add_note_frame = findViewById(R.id.add_note_frame);
        add_new_note = findViewById(R.id.add_new_note);
        note2 = findViewById(R.id.note2);
        note21 = findViewById(R.id.note21);
        them = findViewById(R.id.them);
        abc1 = findViewById(R.id.abc1);
        abc11 = findViewById(R.id.abc11);
        huy = findViewById(R.id.huy);
        haha1 = findViewById(R.id.haha1);
        haha = findViewById(R.id.haha);
        haha22 = findViewById(R.id.haha22);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);


        add_new_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_note_frame.setVisibility(View.VISIBLE);
            }
        });

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
                String timeStamp = new SimpleDateFormat(" HH:mm aa").format(Calendar.getInstance().getTime());
                if(isFirst){
                    isFirst = false;
                    abc1.setVisibility(View.VISIBLE);
                    note2.setVisibility(View.VISIBLE);
                    haha.setText(timeStamp);
                } else {
                    abc11.setVisibility(View.VISIBLE);
                    note21.setVisibility(View.VISIBLE);
                    haha22.setText(timeStamp);
                }
                add_note_frame.setVisibility(View.GONE);
            }
        });

        huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_note_frame.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        // return true so that the menu pop up is opened
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Menu_AboutUs:
                //About US
                break;

            case R.id.Menu_LogOutMenu:
                //Do Logout
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}