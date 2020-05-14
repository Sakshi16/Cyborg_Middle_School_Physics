package com.applications.sakshirambhia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class newton_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newton_three);


        Button button15 = (Button) this.findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(newton_three.this, newton_four.class);
                startActivity(i);


            }
        });
    }

}
