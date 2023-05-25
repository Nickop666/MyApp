package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;

    private Button marsh, builds, musGal;
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void nextBuild(View view){
        Intent build = new Intent(this, Buildings.class);
        startActivity(build);
    }
    public void nextMarsh(View view){
        Intent marsh = new Intent(this, Marsh.class);
        startActivity(marsh);
    }
    public void galmus(View view){
        Intent musgal = new Intent(this, GalMus.class);
        startActivity(musgal);
    }
}