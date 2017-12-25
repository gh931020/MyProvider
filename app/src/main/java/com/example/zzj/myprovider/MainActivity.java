package com.example.zzj.myprovider;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zzj.myprovider.database.MyDataBaseHelper;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MyDataBaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDataBaseHelper(this,"BookStore.db",null,2);
        button = findViewById(R.id.id_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
            }
        });
    }
}
