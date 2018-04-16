package com.example.hp.project1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //위젯 따른 사용할 변수 선언...   데이터타입 변수명; ==> 데이터타입(기본형(8), 참조형:클래스)

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem, btnBmi;
    TextView textResult;
    String num1, num2;
    Integer result;
    Float result2;

    Float BMI,Height,Weight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 계산기");

        //xml 에 있는 id값 찾기
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd); // 나머지 버튼 모두 찾기
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnRem = (Button) findViewById(R.id.BtnRem);
        btnBmi = (Button) findViewById(R.id.BtnBmi);

        textResult = (TextView) findViewById(R.id.TextResult);


        //기능 부여 ==> 이벤트 ==> ontouchlistener
        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과:" + result.toString());

                return false;


            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과:" + result.toString());

                return false;


            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과:" + result.toString());

                return false;


            }
        });


        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();

                result2 = Float.parseFloat(num1) / Float.parseFloat(num2);
                textResult.setText("계산결과:" + result2.toString());

                return false;


            }
        });

        btnRem.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();

                result2 = Float.parseFloat(num1) % Float.parseFloat(num2);
                textResult.setText("계산결과:" + result2.toString());

                return false;

            }
        });

        btnBmi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                //getText() : 입력된 값을 얻기
                //toString() : 문자열화 하기
                num2 = edit2.getText().toString();
               // Height = Height.float.toString();
               // Weight = Weight.float.toString();





                BMI = Float.parseFloat(num1) / Float.parseFloat(num2)*2;

                if (BMI>18.5) {
                    textResult.setText("저체중:" + BMI.toString());
                }
                    else if (BMI>18.5&& BMI<22.9){
                        textResult.setText("정상:" + BMI.toString());
                    }
                    else if (BMI >= 23) {
                        textResult.setText( BMI.toString());
                    }






                return false;

            }
        });



    }
}
