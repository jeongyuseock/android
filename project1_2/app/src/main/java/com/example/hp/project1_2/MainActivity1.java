package com.example.hp.project1_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    //위젯 따른 사용할 변수 선언...   데이터타입 변수명; ==> 데이터타입(기본형(8), 참조형:클래스)

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem, btnBmi, but;
    TextView textResult;
    String num1, num2;
    Integer result;
    Float result2;
    Float BMI,Height,Weight;

    //추가한 10개의 버튼의 사용하기 위한 배열 선언
    //배열선언 : 타입[] 배열명 = new 타입 [크기]
    Button[]numButtons = new Button[10];
    Integer[] numBtnIDS = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5,
                                          R.id.BtnNum6, R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9,};

    int i; //인덱스 번호 체크할 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
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
        but = (Button)findViewById(R.id.button);

        textResult = (TextView) findViewById(R.id.TextResult);


        //배열에 있는 id값 찾기  == for문 이용
        for (int i=0; i< numBtnIDS.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDS[i]);
        }



 //       기능 부여 ==> 이벤트 ==> ontouchlistener
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

//
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

//        btnBmi.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                num1 = edit1.getText().toString();
//                //getText() : 입력된 값을 얻기
//                //toString() : 문자열화 하기
//                num2 = edit2.getText().toString();
//               // Height = Height.float.toString();
//               // Weight = Weight.float.toString();
//
//
//
//                BMI = Float.parseFloat(num1) / Float.parseFloat(num2)*2;
//
//                if (BMI>18.5) {
//                    textResult.setText("저체중:" + BMI.toString());
//                }
//                    else if (BMI>18.5&& BMI<22.9){
//                        textResult.setText("정상:" + BMI.toString());
//                    }
//                    else if (BMI >= 23) {
//                        textResult.setText( BMI.toString());
//                    }
//
//
//
//                return false;
//
//            }
//        });


        //0~9 각 버튼의 기능 부여

        for (i=0; i < numBtnIDS.length; i++){
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edit1.isFocused()==true){
                        num1 = edit1.getText().toString()
                                + numButtons[index].getText().toString();
                            //클릭한 버튼을 계속 추가해서 보여주기
                          edit1.setText(num1);   //setText : 새롭게 값 설정
                    }  else if (edit2.isFocused() ==true) {
                        num2 = edit2.getText().toString()
                                + numButtons[index].getText().toString();
                        edit2.setText(num2);    // 이부분이 숫자를 눌럿을때 나타낸다는 것임
                    }  else {
                        Toast.makeText(getApplicationContext(), "에티트에 값 입력", Toast.LENGTH_SHORT).show();




                    }
                }
            });
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edit1.setText(" ");
                    edit2.setText(" ");
                    textResult.setText(" ");
                }
            });



        }



    }
}
