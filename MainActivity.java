package com.example.basic_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,addition,subtract,multiplication,modulo,division,dot,clear,delete,equals,negation;
    TextView result;
    float value1,value2;
    boolean ifAddition,ifSubtraction,ifMultiplication,ifModulo,ifDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        addition=findViewById(R.id.addition);
        subtract=findViewById(R.id.subtract);
        multiplication=findViewById(R.id.multiply);
        modulo=findViewById(R.id.modulo);
        division=findViewById(R.id.division);
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clear);
        delete=findViewById(R.id.delete);
        negation=findViewById(R.id.negation);
        equals=findViewById(R.id.equals);

        result=findViewById(R.id.result);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        negation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"-");
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }else {
                    value1 = Float.parseFloat(result.getText() + " ");

                    ifAddition = true;
                    result.setText(null);
                }
                }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(result.getText()+" ");
                ifSubtraction=true;
                result.setText(null);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(result.getText()+" ");
                ifMultiplication=true;
                result.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(result.getText()+" ");
                ifDivision=true;
                result.setText(null);
            }
        });
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(result.getText()+" ");
                ifModulo=true;
                result.setText(null);
            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //openActivity2();
                value2=Float.parseFloat(result.getText()+" ");

                if(ifAddition==true){
                    result.setText(value1+value2+"");
                    ifAddition=false;

                }
                if(ifSubtraction==true){
                    result.setText(value1-value2+"");
                    ifSubtraction=false;
                }
                if(ifMultiplication==true) {
                    result.setText(value1*value2+"");
                    ifMultiplication = false;
                }
                if(ifDivision==true) {
                    result.setText(value1/value2+"");
                    ifDivision = false;
                }
                if(ifModulo==true) {
                    result.setText(value1%value2+"");
                    ifModulo = false;
                }
                 //Intent intent =new Intent(MainActivity.this,ResultActivity.class);


            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String delete = result.getText().toString();
                    int length = delete.length();
                    if(length>0){
                        delete=delete.substring(0,length-1);
                        result.setText(delete);
                    }
            }
        });


    }
    public void openActivity2(){
            Intent intent =new Intent(this,ResultActivity.class);
            startActivity(intent);
    }
}
