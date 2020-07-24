package com.example.tentativa3calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    int n1,n2,soma,sub,mult,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.resultado);
        btnSoma = (Button)findViewById(R.id.btnCalcula);
        btnSub = (Button)findViewById(R.id.btnCalcula2);
        btnMult = (Button)findViewById(R.id.btnCalcula3);
        btnDiv = (Button)findViewById(R.id.btnCalcula4);

    }

    public void Calcula(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            soma = n1 + n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(String.valueOf(soma));
    }

    public void Calcula2(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            sub = n1 - n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(String.valueOf(sub));
    }

    public void Calcula3(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            mult = n1 * n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(String.valueOf(mult));
    }

    public void Calcula4(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            div = n1 / n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
    }
}
