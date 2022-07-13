package com.example.callapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mgetphNumber;
    Button mbtnclr;
    Button mbtn1, mbtn2, mbtn3;
    Button mbtn4, mbtn5, mbtn6;
    Button mbtn7, mbtn8, mbtn9;
    Button mbtnstr, mbtn0, mbtnhas;
    Button mbtncall, mbtnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgetphNumber=findViewById(R.id.getphNumber);
        mbtnclr=findViewById(R.id.btnclr);
        mbtn1=findViewById(R.id.btn1);
        mbtn2=findViewById(R.id.btn2);
        mbtn3=findViewById(R.id.btn3);
        mbtn4=findViewById(R.id.btn4);
        mbtn5=findViewById(R.id.btn5);
        mbtn6=findViewById(R.id.btn6);
        mbtn7=findViewById(R.id.btn7);
        mbtn8=findViewById(R.id.btn8);
        mbtn9=findViewById(R.id.btn9);
        mbtn0=findViewById(R.id.btn0);
        mbtnstr=findViewById(R.id.btnstr);
        mbtnhas=findViewById(R.id.btnhas);
        mbtncall=findViewById(R.id.btncall);
        mbtnsave=findViewById(R.id.btnsave);

        mbtnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.setText("");
                mgetphNumber.setHint("Enter the number");
            }
        });

        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("1");
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("2");
            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("3");
            }
        });
        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("4");
            }
        });
        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("5");
            }
        });
        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("6");
            }
        });
        mbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("7");
            }
        });
        mbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("8");
            }
        });
        mbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("9");
            }
        });
        mbtnstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("*");
            }
        });
        mbtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("0");
            }
        });
        mbtnhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mgetphNumber.append("#");
            }
        });
        mbtnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.NAME,"");
                intent.putExtra(ContactsContract.Intents.Insert.PHONE, mgetphNumber.getText().toString());
                startActivity(intent);
            }
        });
        mbtncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=mgetphNumber.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+data));
                startActivity(intent);
            }
        });
    }
}