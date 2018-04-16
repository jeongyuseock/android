package com.example.hp.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnchage;
    ImageView View1;
    ImageView View2;
    int imageIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setTitle("이미지 바꾸기");


        // id 찾기
        btnchage = (Button) findViewById(R.id.btn) ;
        View1=(ImageView)  findViewById(R.id.imageView1);
        View1=(ImageView)  findViewById(R.id.imageView2);



        //버튼 기능 부여
        btnchage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                //메서드호출
                if (imageIndex == 0) {
                    View1.setVisibility(View.VISIBLE);
                    View2.setVisibility(View.INVISIBLE);
                    imageIndex = 1;
                } else if (imageIndex == 1) {
                    View1.setVisibility(View.INVISIBLE);
                    View2.setVisibility(View.VISIBLE);
                    imageIndex = 0;
                }
            }
        });






    }
     //public void changeImage(View () {
    //처리할 코드
    // if (imageIndex==0) {
//                   View1.setVisibility(View.VISIBLE);
//                   View2.setVisibility(View.INVISIBLE);
//    imageIndex=1;
//} else if(imageIndex==1){
//        View1.setVisibility(View.INVISIBLE);
//        View2.setVisibility(View.VISIBLE);
//        imageIndex=0;}





}
