package com.kingja.tinkerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tinkerpatch.sdk.TinkerPatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_main_say = (Button) findViewById(R.id.btn_main_say);
        Button btn_getPatch = (Button) findViewById(R.id.btn_getPatch);
        Button btn_second = (Button) findViewById(R.id.btn_second);
        btn_getPatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "修复中", Toast.LENGTH_SHORT).show();
                TinkerPatch.with().fetchPatchUpdate(true);
            }
        });

        btn_main_say.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "换个图标", Toast.LENGTH_SHORT).show();
            }
        });
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}
