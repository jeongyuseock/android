package com.example.hp.project_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //변수 선언 자료형 변수명;
    Button button1;
    Button button2, button3 ;
    TextView tv1, tv2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //activity_main.xml에 있는 id값 찾아서 변수에 저장하기
        button1 = (Button) findViewById(R.id.button1); //res에서 id값을 button1 찾음
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        tv1 = (TextView) findViewById(R.id.textView1) ;
        tv2 = (TextView) findViewById(R.id .textView2)        ;



        //위젯에 이벤트 부여하기 == >button  에 click이벤트 리스너 부여
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                Toast.makeText
                     (getApplicationContext(),"하이", Toast.LENGTH_SHORT).show();
                //Toast : 메세지 보여주는 클래스
                //makeText() : 메세지를 만들어줌
               //getApplicationContext() : 실행되는 어플리케이션의 내용으로
               //Toast.LENGTH_SHORT: 메세지길이 (보여지는 길이)
               //show() : 보여주기
        }
    });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"반가워",Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"난 정유석",Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"난 정유석",Toast.LENGTH_SHORT).show();
                tv1.setText("정유석"); //변경하고자 하는 텍스트
                tv2.setText("안녕하세요 남자입니다");
                tv1.setTextColor(Color.BLUE);
                tv2.setTextSize(30);
            }
        });


    }
}
