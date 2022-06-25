package com.selva.lanzo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ;
    }
    public void onclick(View view){
        //name
        TextView nameview=findViewById(R.id.nameView);
        EditText yourname=findViewById(R.id.nameId);
        nameview.setText("Name:"+yourname.getText().toString());

        //email
        TextView emailview=findViewById(R.id.emailView);
        EditText yourEmail=findViewById(R.id.emailId);
        emailview.setText( "Email:"+yourEmail.getText().toString());

        //phone
        TextView numberview=findViewById(R.id.phoneView);
        EditText yournumber=findViewById(R.id.numberId);
        numberview.setText( "Phone:"+yournumber.getText().toString());
    }
    }
