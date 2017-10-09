package com.example.hoe.toclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    android.widget.Button hello, adio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //search the button
        hello = (android.widget.Button)findViewById(R.id.hello);
        adio = (android.widget.Button)findViewById(R.id.adio)

        // clickevent listener
        hello.setOnClickListner(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText( getApplicationContext(),"HELLO!", Toast.LENGTH_SHORT).show();
            }
                                }

        );
    adio.setOnClickListener( click);
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText( getApplicationContext(),"Adio!", Toast.LENGTH_SHORT).show();
        }
    };
}
