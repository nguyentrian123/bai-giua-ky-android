package com.example.baigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btnmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmain = findViewById(R.id.buttonMain);

        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class); // mafn hinh hien tai va man hinh di chuyen qa
                intent.putExtra("username","An");
                intent.putExtra("year",1990);
                String[] arr = {"abc","bcd","cde"};
                intent.putExtra("Items",arr);
                SanPham sp = new SanPham("giay",20000);
                intent.putExtra("SanPham", sp);

                Bundle bundle = new Bundle();
                bundle.putString("Username","Tan");
                bundle.putInt("age",20);
                intent.putExtra("data",bundle);

                startActivity(intent);

            }
        });
        Log.d("MYLOG","onCreate Activity Main");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYLOG","onStart Activity Main");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MYLOG","onRestart Activity Main");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYLOG","onStop Activity Main");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYLOG","onDestroy Activity Main");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYLOG","onPause Activity Main");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYLOG","onResume Activity Main");
    }
}