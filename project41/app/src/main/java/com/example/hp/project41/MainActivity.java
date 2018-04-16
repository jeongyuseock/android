package com.example.hp.project41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    //버튼 2개, 뷰플리퍼 1개 변수 선언
    Button btnPrev, btnNext;
    ViewFlipper vFlipper;
    ImageView view1,view2,view3,view4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


          //id 찾기기
            btnPrev = (Button) findViewById(R.id.btnPrev);
            btnNext = (Button) findViewById(R.id.btnNext);
            vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
            vFlipper.setFlipInterval(3000);     //
          // 각 버튼에 클릭 이벤트 부여
            btnPrev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    vFlipper.startFlipping();
                }
            });
            // next 버튼에 기능 부여 ==> showNext()
           btnNext.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   vFlipper.stopFlipping();
               }
           });



    }
}
