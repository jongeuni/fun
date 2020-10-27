package com.example.urlpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void git_buttonClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/joungeun"));
        // Intent를 하면 그 행동이 담겨서 전송이 됨, 화면 전환 기능도 있고... 많음
        startActivity(intent); // 인텐트 실행
    }
    public void insta_buttonClick(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/o.ok_8/"));
        startActivity(intent);
    }
    public void ringmabell_buttonClick(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
}