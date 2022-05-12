package com.example.baigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnSecond = (Button)  findViewById(R.id.buttonSecond);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class); // mafn hinh hien tai va man hinh di chuyen qa
                startActivity(intent);
            }
        });

        Log.d("MYLOG","onCreate Activity2");

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        int year = intent.getIntExtra("Year",2000); // sai KDL & sai Ten
        String [] arr = intent.getStringArrayExtra("Items");
        SanPham sp  = (SanPham) intent.getSerializableExtra( "SanPham");

        Bundle bundle = intent.getBundleExtra("data");
        String userName2 = bundle.getString("Username");
        int age = bundle.getInt("age");

        String s  = "Username :" + username+"\n";
        s+= "Year :"+ year +"\n";
        s+= "Items :" + arr[0] +"\n";
        s+= "Ten san pham:" + sp.getTenSP()+"\n";
        s+= "Gia san pham:" + sp.getGiaSP()+"\n";

        s+= "-------------------"+"\n";
        s+= "username2:" + userName2+"\n";
        s+= "age:" + age+"\n";

        TextView txt = findViewById(R.id.txtView);
        txt.setText(s);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYLOG","onStart Activity Second");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MYLOG","onRestart Activity Second");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MYLOG","onStop Activity Second");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MYLOG","onDestroy Activity Second");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MYLOG","onPause Activity Second");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYLOG","onResume Activity Second");
    }
}