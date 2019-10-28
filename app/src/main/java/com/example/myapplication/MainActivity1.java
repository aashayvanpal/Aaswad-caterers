package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    private EditText password;
    private Button button,button_checkbox,button_sub,button_Register;
    private CheckBox check1,check2,check3;
    private TextView NewAccounttext;



    public static final String MyMessage = "My_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.i(MyMessage,"onCreate method");
        onClickSignIn();
        onClickNewAccount();
        onClickBack();


    }


    public void onClickSignIn(){
        NewAccounttext = (TextView) findViewById(R.id.textView);

        NewAccounttext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".SignUp");
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickBack(){
        NewAccounttext = (TextView) findViewById(R.id.textView);

        NewAccounttext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".SignUp");
                        startActivity(intent);
                    }
                }
        );

    }


    public void onClickNewAccount(){
        button_sub = (Button)findViewById(R.id.button5);

        button_sub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".CustomerLogin");
                        startActivity(intent);
                    }
                }
        );

    }


}
