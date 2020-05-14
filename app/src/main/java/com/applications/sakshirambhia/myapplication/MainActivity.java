package com.applications.sakshirambhia.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sound_button = (Button) this.findViewById(R.id.sound_button);
        Button light_button = (Button) this.findViewById(R.id.light_button);
        Button fluids_button = (Button) this.findViewById(R.id.fluids_button);
        Button newton_button = (Button) this.findViewById(R.id.newton_button);
        Button electricity_button = (Button) this.findViewById(R.id.electricity_button);
        sound_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,sound.class);
                startActivity(i);

            }
        });

        light_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,light_one.class);
                startActivity(i);

            }
        });

        fluids_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, archi_one.class);
                startActivity(i);

            }
        });

        newton_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, newton_one.class);
                startActivity(i);

            }
        });

        electricity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, elec_one.class);
                startActivity(i);

            }
        });

    }




}

