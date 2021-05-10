package com.example.exercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText edt_peso = findViewById(R.id.peso);
                TextView edt_emagrecer = findViewById(R.id.emagrecer);
                TextView edt_engordar = findViewById(R.id.engordar);


                DecimalFormat arredondar = new DecimalFormat("#.##");
                double peso = Double.parseDouble(edt_peso.getText().toString());
                double engordar = peso + (peso*0.15);
                double emagrecer = peso - (peso*0.20);

                edt_emagrecer.setText("Se emagrecer terá: " +  String.valueOf(arredondar.format(emagrecer)) + "kg de peso");
                edt_engordar.setText("Se engordar terá: " +  String.valueOf(arredondar.format(engordar)) + "kg de peso");

            }
        });
    }
}
