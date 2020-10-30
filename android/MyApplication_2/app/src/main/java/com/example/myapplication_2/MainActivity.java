package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnDiv2;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);    //2.바인딩(위젯)
        edit2 = (EditText) findViewById(R.id.Edit2);    //2.바인딩(위젯)

        btnAdd = (Button) findViewById(R.id.BtnAdd);    //2.바인딩(위젯)
        btnSub = (Button) findViewById(R.id.BtnSub);    //2.바인딩(위젯)
        btnMul = (Button) findViewById(R.id.BtnMul);    //2.바인딩(위젯)
        btnDiv = (Button) findViewById(R.id.BtnDiv);    //2.바인딩(위젯)
        btnDiv2 = (Button) findViewById(R.id.BtnDiv2);    //2.바인딩(위젯)

        textResult = (TextView) findViewById(R.id.TextView1);    //2.바인딩(위젯)

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT)
                            .show();
                }else {
                    result= Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 :" + result.toString());

                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT)
                            .show();
                }else {
                    result= Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 :" + result.toString());

                }
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT)
                            .show();
                }else {
                    result= Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 :" + result.toString());

                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")|| num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                }else if(edit2.getText().toString().equals("0")){
                    Toast.makeText(getApplicationContext(),"0으로 나누면 안됩니다!",Toast.LENGTH_SHORT)
                            .show();
                }else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);

                    textResult.setText("계산 결과 :" + result.toString());
                }
            }
        });


        btnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("")|| num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                }else if(edit2.getText().toString().equals("0")){
                    Toast.makeText(getApplicationContext(),"0으로 나누면 안됩니다!",Toast.LENGTH_SHORT)
                            .show();
                }else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);

                    textResult.setText("계산 결과 :" + result.toString());
                }
            }
        });


    }
}