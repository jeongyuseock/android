package com.example.hp.project2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   //사용할 변수 선언
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog,rdoCat,rdoRabit;
    Button btnOK, clear;
    ImageView imaPet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사진 선택");

        // id 찾기
        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        chkAgree = (CheckBox) findViewById(R.id.Checkagree);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog =  (RadioButton) findViewById(R.id.RdoDog);
        rdoCat =  (RadioButton) findViewById(R.id.RdoCat);
        rdoRabit =  (RadioButton) findViewById(R.id.RdoRabit);
        btnOK = (Button) findViewById(R.id.BtnOk);
        imaPet = (ImageView) findViewById(R.id.ImgPet);
        clear =  (Button) findViewById(R.id.Clear);



        //checkbox의 선택 유무 체크할 이벤트
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
           //이벤트 한들러

            if (chkAgree.isChecked()==true)  {
                //isChecked : checked 속성값을 알아볼떄 사용
                // 화면에 보여주기 ==> visible이라는 속성값을 설정
                text2.setVisibility(View.VISIBLE);
                rGroup1.setVisibility(View.VISIBLE);
                btnOK.setVisibility(View.VISIBLE);
                imaPet.setVisibility(View.VISIBLE);
            }else { // 다시 화면에서 숨기기
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                btnOK.setVisibility(View.INVISIBLE);
                imaPet.setVisibility(View.INVISIBLE);
            }

            }
        }); // checkbox 영억에 대한 처리 끝

        //선택완료 버튼에 클릭 이벤트 부여

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                            imaPet.setImageResource(R.drawable.dog);
                            //setImageResources == > android:src 동일기능 ==> 이미지 불러오기
                            break;   // switch문에 break 써야함
                    case R.id.RdoCat:
                            imaPet.setImageResource(R.drawable.cat);
                            //setImageResources == > android:src 동일기능 ==> 이미지 불러오기
                            break;
                    case R.id.RdoRabit:
                            imaPet.setImageResource(R.drawable.rabbit);
                            break;
                            //setImageResources == > android:src 동일기능 ==> 이미지 불러오기
                    default:
                        Toast.makeText(getApplicationContext(),"선택하세요",Toast.LENGTH_SHORT).show();



                }
                clear.setVisibility(View.VISIBLE);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                btnOK.setVisibility(View.INVISIBLE);
                imaPet.setVisibility(View.INVISIBLE);
                clear.setVisibility(View.INVISIBLE);
            }
        });

        rdoDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    imaPet.setImageResource(R.drawable.dog);
            }
        });
        rdoCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imaPet.setImageResource(R.drawable.cat);
            }
        });
        rdoRabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imaPet.setImageResource(R.drawable.rabbit);
            }
        });


    }
}
