package com.example.toastbung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickToast(final View view){
        Toast.makeText(this,"Hallo ich bin ein Toast", Toast.LENGTH_LONG).show();
    }
}





